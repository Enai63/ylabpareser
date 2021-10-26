package com.ylab.handler;

import com.ylab.entity.Child;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

    private Child child;


    @Override
    public void startElement(String uri,
                             String localName,
                             String qName,
                             Attributes attributes) throws SAXException {
        if(qName.equals("child")) {
            child = new Child();
            Boolean isFile = Boolean.parseBoolean(attributes.getValue("isFile"));
            child.setFile(isFile);
        }
        
    }


    @Override
    public void endElement(String uri,
                           String localName,
                           String qName) throws SAXException {

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
    }


}

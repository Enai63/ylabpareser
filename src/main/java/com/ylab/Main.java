package com.ylab;

import com.ylab.handler.Handler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Main {
    private static final String FILENAME = "C:\\Users\\Toha7\\IdeaProjects\\ylabpareser\\test-files.xml";

    public static void main(String[] args) {

            SAXParserFactory factory = SAXParserFactory.newInstance();

            try {

                SAXParser saxParser = factory.newSAXParser();

                Handler handler = new Handler();
                saxParser.parse(FILENAME, handler);


            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }

        }
}

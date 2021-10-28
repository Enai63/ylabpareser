package com.ylab.factory;

import com.ylab.constants.Constant;
import com.ylab.entity.Child;

public class FactoryChild {
    public static Child createChild(String qName) {
        Child child;
        switch (qName) {
            case Constant.INCLUDE_NODE :
                child = new Child();
                break;

        }
        return child;
    }
}

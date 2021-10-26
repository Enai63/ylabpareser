package com.ylab.entity;

import java.util.ArrayList;
import java.util.List;

public class Child {
    private List<Child> children;
    private String name;
    private Boolean isFile;

    public Child() {
    }

    public Child(Boolean isFile, String name) {
        this.name = name;
        this.isFile = isFile;
    }

    public Boolean getFile() {
        return isFile;
    }

    public void setFile(Boolean file) {
        isFile = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void addChildToList(Child child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }
}

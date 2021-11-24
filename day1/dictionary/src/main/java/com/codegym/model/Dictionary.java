package com.codegym.model;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    Map<String, String> treeData = new TreeMap<>();

    public Dictionary() {
        treeData.put("chair", "cai ghe");
        treeData.put("table", "cai ban");
        treeData.put("bed", "cai giuong");
    }

    public Map<String, String> getTreeData() {
        return treeData;
    }
}

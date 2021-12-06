package com.codegym.controller;

import com.codegym.model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;
import java.util.TreeMap;

@Controller
public class DictionaryController {

    @GetMapping("/result")
    public String translate(@RequestParam("english") String english, Model model) {
        Dictionary dictionary = new Dictionary();
        Map<String, String> treeTranslate = new TreeMap<>();
        treeTranslate = dictionary.getTreeData();
        String res;
                return "result";
    }
}

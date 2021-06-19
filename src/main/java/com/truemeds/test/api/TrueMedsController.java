package com.truemeds.test.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrueMedsController {

    @GetMapping("/showLogic")
    public String getDetails() {
        return " static String removeDuplicateHelper(String str, char lastRemoved) {\n" +
                "        if (str.length() == 0 || str.length() == 1)\n" +
                "            return str;\n" +
                "        if (str.charAt(0) == str.charAt(1)) {\n" +
                "            lastRemoved = str.charAt(0);\n" +
                "            while (str.length() > 1 && str.charAt(0) == str.charAt(1))\n" +
                "                str = str.substring(1, str.length());\n" +
                "            str = str.substring(1, str.length());\n" +
                "            return removeDuplicateHelper(str, lastRemoved);\n" +
                "        }\n" +
                "        String rem_str = removeDuplicateHelper(str.\n" +
                "                substring(1, str.length()), lastRemoved);\n" +
                "        if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) {\n" +
                "            lastRemoved = str.charAt(0);\n" +
                "\n" +
                "            return rem_str.substring(1, rem_str.length());\n" +
                "        }\n" +
                "        if (rem_str.length() == 0 && lastRemoved == str.charAt(0))\n" +
                "            return rem_str;\n" +
                "        return (str.charAt(0) + rem_str);\n" +
                "    }";
    }
}

package com.company.api;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.lang.System.out;

public class StaticImportDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        max(list);
        min(list);

        out.println("hello itcast");

    }
}

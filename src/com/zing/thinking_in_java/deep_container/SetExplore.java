package com.zing.thinking_in_java.deep_container;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetExplore {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("zhang");
        set.add("jia");
        set.add("chang");

        System.out.println(set.toString());
    }
}

package com.zing.thinking_in_java.common;

import java.util.*;

public class Statistics {

    static {
        System.out.println("Loading Statistics");
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map.toString());
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((o1, o2) ->
                (o1.getValue() - o2.getValue())
        );
        System.out.println(entryList);

        // verify the contains whether success or not when the object doesn't equals but the value does.
        List<String> ss = new ArrayList<>();
        String s1 = new String("fkdfjdkfjdkfjd");
        ss.add(s1);
        String s2 = new String("fkdfjdkfjdkfjd");
        if (ss.contains(s2)) {
            System.out.println("correct");
        }


        int a = 10;
        lebel:
        while (a-- > 0) {
            if (a == 5)
                continue lebel;
            else
                System.out.println(a);
        }
    }

}

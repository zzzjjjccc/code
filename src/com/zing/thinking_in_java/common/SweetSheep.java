package com.zing.thinking_in_java.common;

import java.lang.reflect.Field;

class Candy {

    public static final String ME = "Zing";
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }

    public void print() {
        System.out.println("Cookie's print method be called");
    }
}

public class SweetSheep {
    public static void main(String[] args) {
        System.out.println("inside main");
//        new Candy();
        System.out.println("After create Candy");
        try {
            Class.forName("com.zing.thinking_in_java.common.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could't find Gum");
        }
        System.out.println("After create Gum");
        new Cookie();
        Class c = null;
        try {
            c = Class.forName("com.zing.thinking_in_java.common.Cookie");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (c != null) {
            try {
                Object o = c.newInstance();
                ((Cookie) o).print();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        try {
            Class.forName("com.zing.thinking_in_java.common.Statistics");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<Candy> cc = Candy.class;

        Field[] f = cc.getDeclaredFields();
        System.out.println(f[0]);

        try {
            cc.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
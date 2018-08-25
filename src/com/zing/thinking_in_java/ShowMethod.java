package com.zing.thinking_in_java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethod {

    private static String usage =
            "usage:\n" +
                    "ShowMethod qualified.class.name\n" +
                    "To show all method in class or:\n" +
                    "ShowMethod qualified.class.name word\n" +
                    "To search for methods involving word";
    private static Pattern p = Pattern.compile("\\w+\\.");

     ShowMethod() {
    }

    public void print() {
        System.out.println("ShowMethod's print");
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length == 1) {
                for(Method method : methods) {
                    String methodName = method.getName();
                    if (methodName.contains("pri")) {
                        method.invoke(c.newInstance(), null);
                    }
                    System.out.println(
                            p.matcher(method.toString()).replaceAll(""));
                }

                for(Constructor ctor : ctors)
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                lines = methods.length + ctors.length;
            } else {
                for(Method method : methods)
                    if(method.toString().indexOf(args[1]) != -1) {
                        System.out.println(
                                p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for(Constructor ctor : ctors)
                    if(ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(
                                ctor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch(ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

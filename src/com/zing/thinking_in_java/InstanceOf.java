package com.zing.thinking_in_java;

interface IBase {
    void print();
}

class Base implements IBase{

    public void print() {
        System.out.println("Base's print");
    }
}

class Derive extends Base{

    public void print() {
        System.out.println("Derive's print");
    }

    public void external() {
        System.out.println("Derive's external");
    }
}

public class InstanceOf {

    private static void test(Object x) {
        System.out.println("Testing x of type " + x.getClass());
        System.out.println("x instanceof Base " + (x instanceof Base));
        System.out.println("x instanceof Derive " + (x instanceof Derive));
        System.out.println("Base.isInstance(x) " + Base.class.isInstance(x));
        System.out.println("Derive.isInstance(x) " + Derive.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        System.out.println("x.getClass() == Derived.class " +
                (x.getClass() == Derive.class));
        System.out.println("x.getClass().equals(Base.class)) "+
                (x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class)) " +
                (x.getClass().equals(Derive.class)));

        System.out.println("Base's package " + Base.class.getPackage());
    }

    public static void main(String[] args) {
        test(new Base());
        test(new Derive());
    }
}

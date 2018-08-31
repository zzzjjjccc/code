package com.zing.thinking_in_java.inner;
class Egg2 {

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    private Yolk y = new Yolk();

    public Egg2() {
        System.out.println("new egg2()");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }
    public void g() {
        y.f();
    }
}

public class BigEgg2 extends Egg2{
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("Bigee2.yolk");
        }

        public void f() {
            System.out.println("Bigegg2.yolk.f()");
        }
    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}

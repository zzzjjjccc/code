package com.zing.thinking_in_java.inner;

public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
    class Destination {
        private String lebel;

        Destination(String lebel) {
            this.lebel = lebel;
        }

        String readLebel() {
            return lebel;
        }
    }
    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLebel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}

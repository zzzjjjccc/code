package com.zing.thinking_in_java.inner;

import sun.security.krb5.internal.crypto.Des;

interface Destination {
    String readLabel();
}

interface Contents {
    int value();
}

class Parcel4 {
    private class PContents implements Contents {

        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {

        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");

    }
}

package com.zing.thinking_in_java.inner;

public class Parcel3 {
    public Contents contents() {
        return new Contents() {
            @Override
            public int value() {
                return 0;
            }
        };
    }
}

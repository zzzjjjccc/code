package com.zing.design.singleton;

public class SingletonInnerHolder {

    private static class Holder {
        private static SingletonInnerHolder mInstance = new SingletonInnerHolder();
    }

    private SingletonInnerHolder() {
    }

    public static SingletonInnerHolder getInstance() {
        return Holder.mInstance;
    }
}

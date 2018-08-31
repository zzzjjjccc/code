package com.zing.design.singleton;

public class SingletonLazyDoubleCheck {

    private volatile static SingletonLazyDoubleCheck mInstance;

    private SingletonLazyDoubleCheck() {

    }

    public static  SingletonLazyDoubleCheck getInstance() {
        if (mInstance == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (mInstance == null) {
                    mInstance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return mInstance;
    }
}

package com.zing.design.singleton;

public class SingletonLazySyn {

    private static SingletonLazySyn mInstance;

    private SingletonLazySyn() {

    }

    public static synchronized SingletonLazySyn getInstance() {
        if (mInstance == null) {
            mInstance = new SingletonLazySyn();
        }
        return mInstance;
    }
}

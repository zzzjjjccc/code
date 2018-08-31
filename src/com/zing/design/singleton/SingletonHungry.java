package com.zing.design.singleton;

public class SingletonHungry {

    private static final SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return INSTANCE;
    }
}

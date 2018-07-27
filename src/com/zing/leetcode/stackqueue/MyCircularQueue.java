package com.zing.leetcode.stackqueue;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {

    private int mSize;
    private List<Integer> mQueue;
    private int mFront;
    private int mRear;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        mSize = k;
        mQueue = new ArrayList<>(mSize);
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        try {
            mQueue.add(mRear++ % mSize , value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        try {
            mQueue.remove(mFront++ % mSize);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (!isEmpty()) {
            return mQueue.get(mFront % mSize);
        }
        return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (!isEmpty()) {
            return mQueue.get((mRear - 1) % mSize);
        }
        return -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return mFront == mRear;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (mRear + 1) % mSize == mFront;
    }

    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(10);
        boolean param_1 = obj.enQueue(8);
        boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
    }
}

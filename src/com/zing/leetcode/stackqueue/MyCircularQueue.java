package com.zing.leetcode.stackqueue;


class MyCircularQueue {

    private int mSize;
    private int mLength;
    private int[] mQueue;
    private int mFront;
    private int mRear = -1;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        mLength = k;
        mQueue = new int[mLength];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        mRear = (mRear + 1) % mLength;
        mQueue[mRear] = value;
        mSize++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        mFront = (mFront + 1) % mLength;
        mSize--;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return mQueue[mFront];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return mQueue[mRear];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return mSize == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return mLength == mSize;
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

package com.zing.leetcode.queue;

public class CircularQueueImpl1 extends BaseCirculerQueue{

    public CircularQueueImpl1(int k) {
        super(k, -1, -1);
    }

    @Override
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            mHead = 0;
        }
        mRear = (mRear + 1) % mSize;
        mQueue[mRear] = value;
        return true;
    }

    @Override
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (mRear == mHead) {
            mHead = -1;
            mRear = -1;
            return true;
        }
        mHead = (mHead + 1) % mSize;
        return true;
    }

    @Override
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return mQueue[mHead];
    }

    @Override
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return mQueue[mRear];
    }

    @Override
    public boolean isEmpty() {
        return mHead == -1;
    }

    @Override
    public boolean isFull() {
        return ((mRear + 1) % mSize == mHead);
    }
}

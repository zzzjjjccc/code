package com.zing.leetcode.queue;

public class CircularQueueImpl2 extends BaseCirculerQueue {

    private int mLength;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     *
     * @param k
     */
    public CircularQueueImpl2(int k) {
        super(k, 0, -1);
        mLength = 0;
    }

    @Override
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        mRear = (mRear + 1) % mSize;
        mQueue[mRear] = value;
        mLength++;
        return true;
    }

    @Override
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        mHead  = (mHead + 1) % mSize;
        mLength--;
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
        return mLength == 0;
    }

    @Override
    public boolean isFull() {
        return mLength == mSize;
    }
}

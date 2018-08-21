package com.zing.leetcode.queue;

public abstract class BaseCirculerQueue {

    protected int[] mQueue;
    protected int mHead;
    protected int mRear;
    protected int mSize;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public BaseCirculerQueue(int size, int head, int rear) {
        mQueue = new int[size];
        mHead = head;
        mRear = rear;
        mSize = size;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public abstract boolean enQueue(int value);

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public abstract boolean deQueue();

    /**
     * Get the front item from the queue.
     */
    public abstract int Front();

    /**
     * Get the last item from the queue.
     */
    public abstract int Rear();

    /**
     * Checks whether the circular queue is empty or not.
     */
    public abstract boolean isEmpty();

    /**
     * Checks whether the circular queue is full or not.
     */
    public abstract boolean isFull();
}

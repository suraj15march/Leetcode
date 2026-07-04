class MyCircularQueue {
    int[] queue;
    int size;
    int front;
    int rear;
    int capacity;

    public MyCircularQueue(int k) {
        size = 0;
        capacity = k;
        queue = new int[k];
        front=0;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        rear = (rear+1)%capacity;
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(front == rear){
            front = 0;
            rear = -1;
            size = 0;
        }
        else{
            front = (front+1)%capacity;
            size--;
        }
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queue[front%capacity];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queue[rear%capacity];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
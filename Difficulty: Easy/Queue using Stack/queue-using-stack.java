class myQueue {

    // Initialize your data members
    int arr[];
    int size;
    int rear;
    
    myQueue() {
        size = 1000;
        arr = new int[size];
        rear = -1;
    }
    
    void enqueue(int x) {
        // Implement enqueue operation
        if(rear == size - 1) {
            return;
        }
        
        rear = rear + 1;
        arr[rear] = x;
    }

    void dequeue() {
        // Implement dequeue operation
        if(rear == -1) {
            return;
        }
        
        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        
        rear--;
    }

    int front() {
        // Implement front operation
        if(rear == -1) {
            return -1;
        }
        
        return arr[0];
    }

    int size() {
        // Implement size operation
        return rear + 1;
    }
}

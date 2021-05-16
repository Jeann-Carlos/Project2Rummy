package proj2.src.Handlers;

public class MyStack<T> {

    private int stackSize;
    private T[] stackArray;
    private int top;
    private int currSize = 0;

    /**
     * constructor to create stack with size
     *
     * @param size
     */
    public MyStack(int size) {
        this.stackSize = size;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }

    /**
     * Adds new entry to the top of the stack
     *
     * @param entry
     * @throws Exception
     */
    public void push(T entry) throws Exception {
        if (this.isStackFull()) {
            System.out.println("Stack Overflow");
            this.increaseStackCapacity();
        }
        this.stackArray[++top] = entry;
        currSize++;
    }

    /**
     * Removes an entry from the top of the stack.
     *
     * @return
     * @throws Exception
     */
    public T pop() throws Exception {
        if (this.isStackEmpty()) {
            System.out.println("Stack underflow.");
        }
        T entry = this.stackArray[top--];
        currSize--;
        return entry;
    }

    /**
     * Returns top of the stack without removing it.
     *
     * @return
     */
    public T peek() {
        try {
            return stackArray[top];
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Returns true if the stack is empty
     *
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }

    /**
     * Returns true if the stack is full
     *
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }

    /**
     * Increase stack capacity
     */
    private void increaseStackCapacity() {
        T[] newStack = (T[]) new Object[this.stackSize * 2];
        for (int i = 0; i < stackSize; i++) {
            newStack[i] = this.stackArray[i];
        }
        this.stackArray = newStack;
        this.stackSize = this.stackSize * 2;
    }


    public int getCurrSize() {
        return currSize;
    }

    public void clear(int size) {
        this.stackSize = size;
        this.stackArray = (T[]) new Object[stackSize];
        this.top = -1;
    }
}


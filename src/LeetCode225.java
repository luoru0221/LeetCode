import java.util.LinkedList;
import java.util.Queue;

public class LeetCode225 {

    private Queue<Integer> pushQueue;
    private Queue<Integer> getQueue;


    /**
     * Initialize your data structure here.
     */
    public LeetCode225() {
        pushQueue = new LinkedList<>();
        getQueue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        pushQueue.offer(x);

        while (!getQueue.isEmpty()) {
            pushQueue.offer(getQueue.poll());
        }

        //交换两个队列
        Queue<Integer> queue = pushQueue;
        pushQueue = getQueue;
        getQueue = queue;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return getQueue.isEmpty() ? -1 : getQueue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return getQueue.isEmpty() ? -1 : getQueue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return getQueue.isEmpty();
    }
}

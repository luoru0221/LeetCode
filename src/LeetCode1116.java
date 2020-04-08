import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * 时间超限
 */
public class LeetCode1116 {
    private int n;
    private int count;
    Lock lock = new ReentrantLock();
    Condition condition;

    public LeetCode1116(int n) {
        this.count = 0;
        this.n = n;
        this.condition = lock.newCondition();
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        for (int i = 1; i <= n; i++) {
            while (count != 0) {
                condition.await();
            }
            printNumber.accept(0);
            if (i % 2 == 1) {
                count = 1;
            } else {
                count = 2;
            }
            condition.signalAll();
        }
        lock.unlock();
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        for (int i = 2; i <= n; i += 2) {
            if (count != 2) {
                condition.await();
            }
            printNumber.accept(i);
            count = 0;
            condition.signalAll();
        }
        lock.unlock();
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        lock.lock();
        for (int i = 1; i <= n; i += 2) {
            if (count != 1) {
                condition.await();
            }
            printNumber.accept(i);
            count = 0;
            condition.signalAll();
        }
        lock.unlock();
    }
}

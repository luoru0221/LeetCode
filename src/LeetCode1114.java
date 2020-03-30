public class LeetCode1114 {

    private volatile int flag = 1;

    public LeetCode1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        while (flag != 1) {
            wait();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag = 2;
    }

    public void second(Runnable printSecond) throws InterruptedException {

        while (flag != 2) {
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        flag = 3;
    }

    public void third(Runnable printThird) throws InterruptedException {

        while (flag != 3) {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}

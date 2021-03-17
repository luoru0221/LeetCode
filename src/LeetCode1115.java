public class LeetCode1115 {

    private int n;
    private boolean flag = true;

    public LeetCode1115(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        synchronized (this) {
            for (int i = 0; i < n; i++) {
                if (!flag) {
                    this.wait();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                flag = false;
                this.notifyAll();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        synchronized (this) {
            for (int i = 0; i < n; i++) {
                if (flag) {
                    this.wait();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                flag = true;
                this.notifyAll();
            }
        }
    }
    class FooBar {
        static final int n = 100;

        public void foo() {
            for (int i = 0; i < n; i++) {
                System.out.println("foo");
            }
        }

        public void bar() {
            for (int i = 0; i < n; i++) {
                System.out.println("bar");
            }
        }
    }
}



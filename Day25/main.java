// Java.lang.Thread
// runnable
// executors
// Fork/Join Framework  Fork/Join框架

public class TaskThreadDemo {
    public static void main(String[] args){
        Runnable printA = new PrintChar('A',50);
        Runnable printB = new PrintChar('B',50);
        Runnable print100 = new PrintNum(100,50);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class PrintChar implements Runnable {
    private char mychar;
    private int  times;

    public PrintChar(char name,int times) {
        this.mychar = name;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.times; i++) {
            System.out.print(this.mychar);
        }
    }
}

class PrintNum implements Runnable {
    private int mynum;
    private int  times;

    public PrintNum(int num,int times) {
        this.mynum = num;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.times; i++) {
            System.out.print(this.mynum);
        }
    }
}

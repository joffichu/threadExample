
class eThread extends Thread {
    private String x;

    public eThread(int x){
        // turn to string
        this.x = String.valueOf(x);
    }

    public void run(){
        System.out.println("Hello I'm " + x);
    }
}

public class exampleThread {
    public static void main(String[] args){
        Thread t1 = new eThread(1);
        Thread t2 = new eThread(2);
        Thread t3 = new eThread(3);
        Thread t4 = new eThread(4);
        Thread t5 = new eThread(5);

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
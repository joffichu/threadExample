class MyThread extends Thread {
    public void run(){
        System.out.println("Hello World in MyThread");
    }
}

public class testThread {
    public static void main(String[] args){
        Thread t1 = new MyThread();   
        t1.start();                 
        System.out.println("Hello World in main Thread");
    }
}
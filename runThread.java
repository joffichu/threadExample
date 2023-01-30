import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class runThreads extends Thread {
    private int x;

    public runThreads(int x){
        // turn to string
        this.x = x;
    }

    public void run(){
    	try {
	    	switch (x) {
		        case 1: 
		        	getSensorA();
		        	break;
		        case 2: 
		        	getSensorB();
		        	break;
		        case 3: 
		        	getSensorC();
		        	break;
		        case 4: 
		        	getSensorD();
		        	break;
		        case 5: 
		        	getSensorE();
		        	break;
		        default:
		            break;
		    }
	    	
	    	
	    	
    	}catch(Exception e1) {
    		e1.printStackTrace();
    	}
    	return;
    }
    
    private boolean getSensorA() throws InterruptedException {
    	/*for(int i=1; i<=100;i++) {
    		String stock = String.format("%04d", i);
        	String fileurl = "https://query1.finance.yahoo.com/v7/finance/download/"+
        			stock
        			+".HK?period1=1604275200&period2=1604361600&interval=1d&events=history&includeAdjustedClose=true";
    		
        	String filename = "D:\\temp\\"+stock+".HK.csv";
    		try {
    			InputStream in = new URL(fileurl).openStream();
				Files.copy(in, Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.print(i);
			}
    	}*/
    	int task = 1;
    	readFile.readFile(task);
    	return true;
    }

    private boolean getSensorB() throws InterruptedException {
    	/*for(int i=100; i<=200;i++) {
    		String stock = String.format("%04d", i);
        	String fileurl = "https://query1.finance.yahoo.com/v7/finance/download/"+
        			stock
        			+".HK?period1=1604275200&period2=1604361600&interval=1d&events=history&includeAdjustedClose=true";
    		
        	String filename = "D:\\temp\\"+stock+".HK.csv";
    		try {
    			InputStream in = new URL(fileurl).openStream();
				Files.copy(in, Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.print(i);
			}
    	}*/
    	int task = 2;
    	readFile.readFile(task);
    	return true;
    }

    private boolean getSensorC() throws InterruptedException {
    	/*for(int i=200; i<=300;i++) {
    		String stock = String.format("%04d", i);
        	String fileurl = "https://query1.finance.yahoo.com/v7/finance/download/"+
        			stock
        			+".HK?period1=1604275200&period2=1604361600&interval=1d&events=history&includeAdjustedClose=true";
    		
        	String filename = "D:\\temp\\"+stock+".HK.csv";
    		try {
    			InputStream in = new URL(fileurl).openStream();
				Files.copy(in, Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.print(i);
			}
    	}*/
    	int task = 3;
    	readFile.readFile(task);
    	return true;
    }
    
    private boolean getSensorD() throws InterruptedException {
    	/*for(int i=300; i<=400;i++) {
    		String stock = String.format("%04d", i);
        	String fileurl = "https://query1.finance.yahoo.com/v7/finance/download/"+
        			stock
        			+".HK?period1=1604275200&period2=1604361600&interval=1d&events=history&includeAdjustedClose=true";
    		
        	String filename = "D:\\temp\\"+stock+".HK.csv";
    		try {
    			InputStream in = new URL(fileurl).openStream();
				Files.copy(in, Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.print(i);
			}
    	}*/
    	int task = 3;
    	readFile.readFile(task);
    	return true;
    }

    private boolean getSensorE() throws InterruptedException {
    	/*for(int i=400; i<=500;i++) {
    		String stock = String.format("%04d", i);
        	String fileurl = "https://query1.finance.yahoo.com/v7/finance/download/"+
        			stock
        			+".HK?period1=1604275200&period2=1604361600&interval=1d&events=history&includeAdjustedClose=true";
    		
        	String filename = "D:\\temp\\"+stock+".HK.csv";
    		try {
    			InputStream in = new URL(fileurl).openStream();
				Files.copy(in, Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				System.out.print(i);
			}
    	}*/
    	int task = 5;
    	readFile.readFile(task);
    	return true;
    }
}

public class runThread {
    public static void main(String[] args) throws InterruptedException{
    	
        Thread t1 = new runThreads(1);
        Thread t2 = new runThreads(2);
        Thread t3 = new runThreads(3);
        Thread t4 = new runThreads(4);
        Thread t5 = new runThreads(5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        System.out.println("Done");
    }
}

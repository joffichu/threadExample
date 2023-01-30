import java.io.File;

public class readFile {
	public static void readFile(int task) {
		System.out.println("task "+task);
		File f = new File("D:\\temp");
    	String[] a  = f.list();
    	int b = Math.round(a.length/5);
		
    	if(task==1) {
    		for(int i=0; i<=b*2;i++) {
        		System.out.println(a[i]);
        	}
    	}else {
	    	for(int i=(b*task)+1; i<=(b*task)*2;i++) {
	    		System.out.println(a[i]);
	    	}
    	}
	}
}

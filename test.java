import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class test {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		int maxDay = 100;
		int countDay = 100;
		for (int i = 0; i <= maxDay; i++) {
			Calendar c = Calendar.getInstance();
			System.out.println(countDay);
			c.add(Calendar.DATE, -countDay);
			System.out.println(dateFormat.format(c.getTime()));
			countDay--;
		}
		
		
		//Set timer
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		    @Override
		    public void run() {
		        //code
		    }
		}, 0, 1000);
	}
}

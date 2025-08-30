import java.util.Date;
import java.text.SimpleDateFormat;

class Main {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		System.out.println(sdf.format(d));
	}
}

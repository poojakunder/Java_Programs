package DateClass_demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/d/yyyy");
		System.out.println(sdf.format(d));
		System.out.println("*****************");
		Calendar cl=Calendar.getInstance();
		System.out.println(sdf.format(cl.getTime()));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));

	}

}

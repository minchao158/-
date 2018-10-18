package 循环捕获;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Circle {
	public static void main(String[] s)
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-mm-dd");
		List<Date> list = new ArrayList<>(10);
		//捕获一次异常
		for(int cnt = 0;cnt<10;cnt++)
		{
			try {
				Date date=dateformat.parse("09-12");
				list.add(date);
			}catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
		}
		//捕获十次异常
		try {
			for(int cnt1=0;cnt1<10;cnt1++)
			{
				Date date=dateformat.parse("09-12");
				list.add(date);
			}
			}catch(java.text.ParseException e)
			{
				e.printStackTrace();
			}
		}
}

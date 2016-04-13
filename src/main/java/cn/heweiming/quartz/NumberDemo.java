package cn.heweiming.quartz;

import java.text.DecimalFormat;


public class NumberDemo {

	public static void main(String[] args) {
		float f = 33.45f;
//		System.out.println(Math.round(f*10)/10.0);
//		String str = new String(f+"");
//		System.out.println(str);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		String format = decimalFormat.format(f);
		System.out.println(format);
	}
}

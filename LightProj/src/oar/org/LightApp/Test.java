package oar.org.LightApp;

import java.util.Scanner;

public class Test {

	//consumer / utilization logic
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Light Type.");
		String type=sc.next();
				sc.close();
		ISwitch sw=LightFactory.getLight(type);
		if(sw!=null) {
			sw.sOn();
			sw.sOff();
		}
	}

}

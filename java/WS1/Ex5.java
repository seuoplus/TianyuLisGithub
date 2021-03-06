/** Exercises 5 of MSc Software Workshop Worksheet 1
 *  Calaulate the angle between the hour hand and the minute hand
 *  
 *  @author  Tianyu Li
 *  @num.    1568785
 *  @ID      txl486
 *  @email   405815927@qq.com
 *  @date    2015-10-1
 *  @github  http://github.com/poorTANY/TianyuLisGithub
 */

import java.util.*;
import java.math.*;

class Ex5 {
	
	public static void main(String[] args) {
		
		//initialize
		Ex5 ex5 = new Ex5();
		ex5.read(args);
		ex5.calculate();
		ex5.print();
	}
	
	int hours,minutes;
	double angle;
	String time;
	
	void read(String[] args) {
		
		//for overflow
		if(args.length == 0) time="9:00";
		else time = args[0];
		
		String tmp="";
		
		//seperate hours and minutes
		for (int i=0; i < time.length(); i++) 
			if (time.charAt(i) == ':') {hours=Integer.parseInt(tmp);tmp="";}
			else tmp = tmp + time.charAt(i);		
		minutes = Integer.parseInt(tmp);
	}
	
	void calculate () {
		//hour hand goes 30 degree every 60 mintues
		angle = 360.0 + 30 * hours + 30 / 60 * minutes - 6 * minutes;
	}
	
	void print() {
		System.out.println("");
		System.out.println("At " + time + ", the angle between the hour hand and the minute hand is:");
		System.out.println(angle%360);
		System.out.println("");
	}
}

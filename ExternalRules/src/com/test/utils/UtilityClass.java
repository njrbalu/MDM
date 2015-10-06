package com.test.utils;

import java.sql.Timestamp;



public class UtilityClass {
	
	/*If ts1 is latest then 1 is returned if equal 0 if ts2 is latest -1 is returned*/
	public static int compareLUD(String ts1, String ts2){
		Timestamp t1 = Timestamp.valueOf(ts1);
		Timestamp t2 = Timestamp.valueOf(ts2);
		return t1.compareTo(t2);
	}
	
}

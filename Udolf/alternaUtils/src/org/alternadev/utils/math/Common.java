package org.alternadev.utils.math;

public class Common {
	public static long faculty(int n){
		if(n < 2)
			return 1;
		return faculty(n-1)*n;
	}
}

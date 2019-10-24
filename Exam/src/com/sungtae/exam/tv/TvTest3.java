package com.sungtae.exam.tv;

public class TvTest3 {
	public static void main(String[] args) {
		LGTv tv1 = new LGTv("XE-123");
		System.out.println(tv1.model);
		
		LGTv tv2 = new LGTv("DD-123");
		System.out.println(tv2.model);
		
		LGTv tv3 = new LGTv("HF-123");
		System.out.println(tv3.model);
		
		
		System.out.println(tv1.model);
		System.out.println(tv2.model);
		System.out.println(tv3.model);
		Tv tv = tv1;
		tv.showState();
				
		
		
	}
}

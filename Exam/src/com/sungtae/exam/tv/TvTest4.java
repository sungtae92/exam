package com.sungtae.exam.tv;

public class TvTest4 {
	public static void main (String[] args) {
		
		LGTv lgtv = new LGTv();
		
		Tv tv = lgtv; // 자동형변환
		
		tv = new SamsungTv();
		
		// LGTv lgtv2 = (LGTv)tv;
	}
}

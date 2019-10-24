package com.sungtae.exam.tv;

public class TvTest5 {
	public static void main(String[] agrs) {
		SamsungTv sstv = new SamsungTv();
		LGTv lgtv = new LGTv();
		
		mainShowState(sstv);
		mainShowState(lgtv);
		
		
	}
	// 다용성으로 부모가 자식을 호출해서
	public static void mainShowState(Tv tv) {
		tv.showState();
	}
	
	
}

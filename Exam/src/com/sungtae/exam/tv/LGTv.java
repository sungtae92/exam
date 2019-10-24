package com.sungtae.exam.tv;

public class LGTv extends Tv {
	
	public  String model;
	
	public LGTv() {}
	public LGTv(String str) {
		model = str;
	}
	
	public void record() {
		System.out.println("녹화");
	}
	
	@Override
	public String toString() {
		return "LGtv임!! ㅋㅋㅋ";
	}
	@Override
	public void showState() {
		System.out.printf("!!!!");
	}
	
}

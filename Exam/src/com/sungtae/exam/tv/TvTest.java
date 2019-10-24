package com.sungtae.exam.tv;

public class TvTest {
	public static void main (String[] args) {
		//객체화, 인스턴스
		Tv tv1 = new Tv(330, 50); // 주소값 (레퍼런스 변수 참조변수)
		Tv tv2 = new Tv();
		
		tv2.setChannel(20);
		tv2.setVolume(100);
		
		
		tv1.showState();
		tv2.showState();
		
		
		int volume = tv2.getVolume();
		System.out.println("Tv1의 볼륨 : " + volume);
	}
}

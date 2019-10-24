package com.sungtae.exam.tv;

public class TvTest2 {
	public static void main(String[] args) {
		LGTv lgtv2 = new LGTv();
		LGTv lgtv3 = new LGTv();
		
		SamsungTv smtv1 = new SamsungTv();
		
		System.out.println(lgtv2.toString());
		System.out.println(smtv1.toString());
		// System.out.println(lgtv2 == lgtv3);
		smtv1.showState();
		
		
		/*
		LGTv lgtv = new LGTv();
		lgtv.showState();
		lgtv.channelUp();
		lgtv.channelUp();
		lgtv.showState();
		lgtv.record();

		SamsungTv smtv1 = new SamsungTv();
		smtv1.channelUp();
		smtv1.showState();
		*/
	}
}

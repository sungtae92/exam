package com.sungtae.exam.tv;

public class SamsungTv extends Tv {
	@Override // 부모에 있는거 사용한다?
	void channelUp() {
		setChannel(channel + 5);
	}
	
	@Override
	public String toString() {
		return String.format("%stv의 채널 : %d, 볼륨 : %d", "삼성", channel, volume);
	}
}

package com.sungtae.exam.tv;

//private, default, protected, public 지시어
// 변수, 클래스, 지시어 앞에 사용
//사용자 정의 클래스
public class Tv {
	protected int channel; // 은닉화된거 값입력  1.생성자를 통해서 넣는 법, 2.setter
	protected int volume;
	
	Tv() {}
	
	Tv(int channel, int volume) {
		setChannel(channel);
		setVolume(volume);
	}
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel < 1) {
			this.channel = 1;
		}
		else if(channel > 300) {
			this.channel = 300;
		}
		else {
			this.channel = channel;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume < 0) {
			this.volume = 0;
		}
		else if(volume > 20) {
			this.volume = 20;
		}
		else {
			this.volume = volume;
		}
	}

	void showState() {
		System.out.printf("channel : %d, volume : %d\n", channel, volume);
	}
	void channelUp() {
		channel++;
	}
	void channelDonw() {
		channel--;
	}
	void volumeUp() {
		volume++;
	}
	void volumeDown() {
		volume--;
	}
}

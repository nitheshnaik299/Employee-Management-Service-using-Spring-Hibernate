package com.sakha.SimCard1;

import org.springframework.stereotype.Component;

@Component
public class Messagegateway {
	float smsCharge;
	float mmsCharge;
	
	public float getSmsCharge() {
		return smsCharge;
	}
	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}
	public float getMmsCharge() {
		return mmsCharge;
	}
	public void setMmsCharge(float mmsCharge) {
		this.mmsCharge = mmsCharge;
	}
	public void sendSms()
	{
		System.out.println("send sms");
	}
	public void sendMms()
	{
		System.out.println("send Mms");
	}

}

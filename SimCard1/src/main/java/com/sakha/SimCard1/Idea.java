package com.sakha.SimCard1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("idea")
public class Idea implements Sim{
	int internetCharge;
	float smsCharge;
	float callCharge;
	
	Messagegateway msg;
	
    
	public Idea() {
		super();
	}

	public int getInternetCharge() {
		return internetCharge;
	}

	public void setInternetCharge(int internetCharge) {
		this.internetCharge = internetCharge;
	}

	public float getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browse using Idea");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call using idea");
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("send sms using Idea");
		msg.sendMms();
	}

	@Override
	public void sendMms() {
		// TODO Auto-generated method stub
		msg.sendMms();
	}

	public Idea(int internetCharge, float smsCharge, float callCharge, Messagegateway msg) {
		super();
		this.internetCharge = internetCharge;
		this.smsCharge = smsCharge;
		this.callCharge = callCharge;
		this.msg = msg;
	}

	@Override
	public void supportedNetwork() {
		// TODO Auto-generated method stub
		
	}

	public Messagegateway getMsg() {
		return msg;
	}

	public void setMsg(Messagegateway msg) {
		this.msg = msg;
	}
	
	

}

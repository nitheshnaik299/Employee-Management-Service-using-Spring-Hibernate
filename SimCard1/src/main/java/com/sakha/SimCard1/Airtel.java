package com.sakha.SimCard1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{
	
	//@Value("${callCharge}")
	float callCharge;
	//@Value("${smsCharge}")
	float smsCharge;
	//@Value("${mmsCharge}")
	float mmsCharge;
	//@Value("${internetCharge}")
	int internetCharge;
	
	
	List<String> list=new ArrayList();
	
	@Autowired
	Messagegateway msg;
	

	public int getInternetCharge() {
		return internetCharge;
	}

	public void setInternetCharge(int internetCharge) {
		this.internetCharge = internetCharge;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public float getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browse using Airtel"+"netspeed"+internetCharge+"/kbps");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call using Airtel"+callCharge);
	}
	public Airtel() {
		// TODO Auto-generated constructor stub
	}

	

	public Airtel(int internetCharge, float callCharge, float smsCharge, Messagegateway msg) {
		super();
		this.internetCharge = internetCharge;
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
		this.msg = msg;
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("send sms using Airtel"+smsCharge);
		msg.sendSms();
	}

	@Override
	public void sendMms() {
		// TODO Auto-generated method stub
		msg.sendMms();
		
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public void supportedNetwork() {
		// TODO Auto-generated method stub

		System.out.println(list);
		System.out.println(callCharge);
	}

	public Messagegateway getMsg() {
		return msg;
	}

	public void setMsg(Messagegateway msg) {
		this.msg = msg;
	}
	
	
	
}

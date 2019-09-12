package com.sakha.SimCard1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sakha.SimCard1.Sim;

@Component
public class Mobile {
	
	@Autowired
	@Qualifier("airtel")
	Sim sim;
	
	
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public void makeACall()
	{
		sim.call();
	}
	public void sendSms()
	{
		sim.sendSms();
	}
	public void sendMms() {
		sim.sendMms();
	}
	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}
	public void browseInternet()
	{
		sim.browse();
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	public void supNet()
	{
		sim.supportedNetwork();
	}
}

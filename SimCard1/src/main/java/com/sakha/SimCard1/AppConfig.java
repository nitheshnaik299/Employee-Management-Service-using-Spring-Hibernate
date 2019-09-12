package com.sakha.SimCard1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
/*@ComponentScan("com.sakha.SimCard1")*/
@PropertySource("app.properties")
public class AppConfig {
	@Bean("ms")
	public Messagegateway getmsBean()
	{
		Messagegateway msg=new Messagegateway();
		msg.setSmsCharge(1.2f);
		msg.setMmsCharge(2.3f);
		return msg;
	}
	
	@Bean("airtel")
	public Airtel getAirtelBean()
	{
		Airtel airtel=new Airtel();
		airtel.setInternetCharge(2);
		airtel.setCallCharge(2.4f);
		airtel.setSmsCharge(1.3f);
		airtel.setMsg(getmsBean());
		return airtel;
	}
	
	@Bean("idea")
	public Idea getIdeaBean()
	{
		Idea idea=new Idea();
		idea.setInternetCharge(2);
		idea.setCallCharge(2.4f);
		idea.setSmsCharge(1.3f);
		idea.setMsg(getmsBean());
		return idea;
	}
	
	@Bean("mobile")
	public Mobile getMobileBean()
	{
		Mobile mb=new Mobile();
		mb.setSim(getAirtelBean());
		return mb;
	}
	
}



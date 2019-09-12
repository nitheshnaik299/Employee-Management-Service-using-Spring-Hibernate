package com.sakha.SimCard1;

public interface Sim {
	void browse();
	void call();
	void sendSms();
	void sendMms();
	void supportedNetwork();
	void setCallCharge(float callCharge);

}

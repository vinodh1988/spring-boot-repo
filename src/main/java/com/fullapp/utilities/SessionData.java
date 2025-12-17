package com.fullapp.utilities;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionData {
	{
		System.out.println("Instance of sessiondata is created");
	}
   private int data;

public int getData() {
	return data;
}

public void setData() {
	this.data++;
}
   
   
}

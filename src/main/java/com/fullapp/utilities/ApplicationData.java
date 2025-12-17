package com.fullapp.utilities;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApplicationData {
	{
		System.out.println("Instance of ApplicationData is created");
	}
   private int data;

public int getData() {
	return data;
}

public void setData() {
	this.data++;
}
}

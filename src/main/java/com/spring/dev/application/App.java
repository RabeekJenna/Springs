package com.spring.dev.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.dev.modelinterface.Journey;

public class App {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("springconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("traveller");
		Journey jrny = (Journey) obj;
		jrny.startJourney();

	}
}

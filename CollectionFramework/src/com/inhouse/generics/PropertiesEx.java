package com.inhouse.generics;

import java.util.Properties;
import java.util.Set;
/*
 * Properties is a subclass of Hashtable.
 */
public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		String vmVersion = prop.getProperty("java.vm.version");
		System.out.println("vmVersion : " + vmVersion);
		System.out.println("###############################################");
		Set propSet = prop.entrySet();
		
		propSet.forEach((v) -> System.out.println(v));
		
		System.out.println("###############################################");
		
		Properties p = new Properties();
		p.setProperty("name", "Sandip Salunkhe");
		p.setProperty("password", "AllieMay@2021");
		Set pSet = p.entrySet();
		pSet.forEach((v) -> System.out.println(v));

	}

}

package com.cucumber.utilities;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyData {

	public String getPropertyData(String key) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(PropertyFilePath.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
	}
}

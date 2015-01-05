package org.fao.fenix.commons.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Properties extends java.util.Properties {

	private static final long serialVersionUID = 1L;


	public static Properties getInstance(String ... paths) throws IOException {
		Properties properties = new Properties();

		if (paths!=null)
			for (String path : paths) {
				InputStream inputStream = null;
				if (path.startsWith("file:"))   //External file
					try { inputStream = new FileInputStream(path.substring("file:".length())); } catch (Exception ex) { }
				else   //Classpath resource
					try { inputStream = Properties.class.getResourceAsStream(path); } catch (Exception ex) { }

				if (inputStream!=null)
					properties.load(inputStream);
			}

		return properties;
	}


	public Map<String,String> toMap() {
		Map<String,String> properties = new HashMap<String,String>();
		for (Entry<Object, Object> property : entrySet())
			properties.put(property.getKey().toString(),property.getValue().toString());
		return properties;
	}	
	public Map<String,String> toMap(String prefix) {
		if (prefix==null)
			return toMap();

		Map<String,String> properties = new HashMap<String,String>();
		for (Entry<Object, Object> property : entrySet()) {
			String key = property.getKey().toString();
			if (key.startsWith(prefix)) {
				key=key.substring(prefix.length());
				if (key.charAt(0)=='.')
					key = key.substring(1);
				properties.put(key, property.getValue().toString());
			}
		}
		return properties;
	}

}

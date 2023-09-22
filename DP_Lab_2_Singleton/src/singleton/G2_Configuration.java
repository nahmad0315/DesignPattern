/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;
    import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.HashMap;
/**
 *
 * @author Nabeel Ahmad
 */
public class G2_Configuration {

	private static G2_Configuration instance;
	private HashMap<String,String> config = new HashMap<String,String>();

	private G2_Configuration(){
		try {
			File file = new File("config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration<Object> enuKeys = properties.keys();

			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				config.put(key,value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getValue(String key){
		String value = null;
		if(config.containsKey(key)){
			value = config.get(key);
		}
		return value;
	}
	public static G2_Configuration getInstance(){
		if(instance == null)
			instance = new G2_Configuration();
		return instance;
	}
}

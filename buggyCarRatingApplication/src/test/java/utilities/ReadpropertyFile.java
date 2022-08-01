package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader configFile = new FileReader("C:\\workspace\\buggyCarRatingApplication\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties properties = new Properties();
		
		properties.load(configFile);
		
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("testURL"));
	}

}

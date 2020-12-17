import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Sample {

	
	public static File configFile = new File(System.getProperty("user.dir")+"/src/config/config.properties");
	public static FileReader reader; 
	public static FileWriter writer;
	public static Properties props;
	
	public static String host ;
	
	
	public static void LoadAndReadConfigFile() { 
		 
		try {
		    reader = new FileReader(configFile);
		    props = new Properties();
		    props.load(reader);
		 
		    host = props.getProperty("host");
		 
		    System.out.print("Host name is : " + host);
		    reader.close();
		    
		} catch (FileNotFoundException ex) {
			System.out.print("File does not exist");
		} catch (IOException ex) {
			System.out.print("I/O error");
		}
	}
	
	public static void SetValueAndSaveConfigFile() { 
		 
		try { 
		    props = new Properties();  
		    props.setProperty("user", "admin");
		    props.setProperty("port", "7777");
		    props.setProperty("pass", "public"); 
		    props.setProperty("host", "www.selcukgenc.com");  
		    
		    writer = new FileWriter(configFile);
		    props.store(writer, "update host settings"); 
		    
		    writer.close();  
		    
		} catch (FileNotFoundException ex) {
			System.out.print("File does not exist");
		} catch (IOException ex) {
			System.out.print("I/O error");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadAndReadConfigFile();
		SetValueAndSaveConfigFile();
	}

}

package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class C3 {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/common.property");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("Url");
	String un=p.getProperty("UN");
	System.out.println(url);
	System.out.println(un);
			
	

	}

}

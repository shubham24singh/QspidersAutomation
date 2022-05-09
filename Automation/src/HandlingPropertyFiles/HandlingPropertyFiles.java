package HandlingPropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFiles {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/common.property");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("Url");
	String un = p.getProperty("UN");
	String pwd = p.getProperty("Pwd");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	

	}

}

package day2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
	private String parameterA;
	private String praameterB;
	public String getParameterA() {
		return parameterA;
	}
	public String getPraameterB() {
		return praameterB;
	}
	
	public AppConfig(){
		readConfig();
	}
	
	private void readConfig(){
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = AppConfig.class.getResourceAsStream("AppConfig.properties");
			p.load(in);
			this.parameterA = p.getProperty("paramA");
			this.praameterB = p.getProperty("paramB");
		} catch (IOException e) {
			System.out.println("װ�������ļ�����");
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}

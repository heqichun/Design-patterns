package day2;

public class Client {

	public static void main(String[] args) {
		AppConfig config = new AppConfig();
		String paramA = config.getParameterA();
		String paramB = config.getPraameterB();
		System.out.println("paramA="+paramA+",paramB="+paramB);
	}

}

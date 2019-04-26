package day1;

public class Client {

	public static void main(String[] args) {
		Api api = new Impl();
		api.test1("hello word!");
	}

}

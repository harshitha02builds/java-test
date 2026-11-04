package firstproject;

public class Student {

	public static void main(String[] args) {
		System.out.println("hello");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

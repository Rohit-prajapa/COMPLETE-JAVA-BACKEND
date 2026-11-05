
public class LaunchClassForNameEx {

	public static void main(String[] args) throws ClassNotFoundException {
//		Demo d=new Demo();
		Class.forName("Demo");
		 
	}

}

class Demo{
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Intance Block---> non static Block");
	}
}

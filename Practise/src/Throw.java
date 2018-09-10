import java.io.FileNotFoundException;

public class Throw {

	public static void main(String[] args) throws Exception   {
		String s="Nsr";
		if(s=="Nisar") {
			System.out.println("Nizzzzzzar");
			throw new FileNotFoundException("Age Not ");
	//	System.out.println("Nisar");
		}
		else {
			System.out.println("Age Valid");
		}
		System.out.println("NIsar");
		
	}

}

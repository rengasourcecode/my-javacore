package exercises;

import java.util.Scanner;

public class StringClass{
	public static void main(String[] args) {
		
	/*String a="BIX";
	String b="BIX";
	String s = new String("Nisar");
	String s1= new String("Nisar");
	System.out.println(s.equals(s1));
	System.out.println(s==s1);
	System.out.println(a.equals(b));
	System.out.println(a==b);
	}*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll number 101 to 105");
		int rollno=scan.nextInt();
		switch(rollno)
		{
		case 101 :
			System.out.println("The name is Nizar");
			break;
        case 102 :
		    System.out.println("The name is Nizar");
		    break;
	    case 103 :
	 		System.out.println("The name is khan");
			break;
	    case 104 :
			System.out.println("The name is bhasha");
			break;
	    case 105 :
			System.out.println("The name is mohammed");
			break;
	     default :
			System.out.println("Invalid no");
			break;
		}
	
		
}
}

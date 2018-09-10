
package exercises;

public class First {

	 int _a;
	 First()
	 {
		 
	 }
	 /*First()
	 {
		 int fan=10;
		 System.out.println(fan);
	 }*/
	 
	 First(String word)
	 {
		 System.out.println(word);
		 
	 }
	 
	 First(int word)
	 {
		 System.out.println(word);
	 }
	 
	 First(String word,int numb)
	 {
		 System.out.println(word);
		 System.out.println(numb);
	 }

	 void add()
	 {
		 int a=45,b=65;
		 System.out.println(a+b);
	 }
	static  void hello()
	 {
		 System.out.println("First class method");
		 First sd = new First();
		 sd.add();
	 }
		
	

}

class Second extends First
{
	public static void main(String[] args) {
		//First.hello();
		//First ft = new First();
		//ft.hello();
		Second sd = new Second();
		hello();
	}
}



//new allocates memory for class
//heap memory is created and object is stored in it
//instance , static stack memory

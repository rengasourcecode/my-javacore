package exercises;
public class Usingstatic {
static void add()
{
	System.out.println("addition");
}
static void sub()
{
	add();
	add();
	add();
	add();
	System.out.println("subraction");
}
public static void main(String[] args) {
	{
		sub();
	}
}
}


public class Multidimensionarray {

	public static void main(String[] args) {
		
		int array1[][]= new int[3][3];
		int array2[][]=new int[3][3];
		int array3[][]=new int[3][3];

		int val=1,val2=2;
		
		System.out.println("ARRAY 1");
		System.out.println();

		for(int i=0;i<3;i++)
		{
			for( int a=0;a<3;a++)
			{
				array1[i][a]=val;
				System.out.print(array1[i][a]+" ");
				val+=1;
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("ARRAY 2");
		System.out.println();

		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				array2[a][b]=val2;
				System.out.print(array2[a][b]+" ");
				val2+=2;
		     }
			System.out.println();
		}
		System.out.println();

		System.out.println("ADDITION of TWO ARRAYS");
		System.out.println();


		for(int i=0;i<3;i++)
		{
			for(int a=0;a<3;a++)
			{
				array3[i][a]=array1[i][a]+array2[i][a];
				System.out.print(array3[i][a] +" ");
			}
			System.out.println();
		}

	}

}

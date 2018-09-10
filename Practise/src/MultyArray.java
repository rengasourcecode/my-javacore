
public class MultyArray {

	public static void main(String[] args) {
		int val=10;
		
		int arr[][][]=new int[4][4][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int z=0;z<arr.length;z++)	{			
				arr[i][j][z]=val;
				System.out.print(arr[i][j][z]+"  ");
				val+=10;
				}
			}
			System.out.println();
			
			
			
		}
				
	
	
	
	
	}

}

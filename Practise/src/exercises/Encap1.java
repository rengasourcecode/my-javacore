package exercises;
 class Setting
 {
	private String name;
	 String getName()
	{
		return name;
		
	}
	
      void setName(String name)
	{
		this.name=name;
		
	}
	
}
public class Encap1 
{
	public static void main(String[] args) 
	{	
			Setting s = new Setting();
			s.setName("RENGA");
			System.out.println(s.getName());
			//ststic means
		//Setting.setName("renga");
		//System.out.println(Setting.getName());

    }

}

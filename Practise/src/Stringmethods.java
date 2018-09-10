
public class Stringmethods {

	public static void main(String[] args) {
      String s1=new String("Mohammed");
      String s3= s1.concat("dinesh");
      String s2=new String("khan");
      System.out.println(s1 + s2);
      System.out.println(s1.equalsIgnoreCase(s2));
      System.out.println(s2.length());
      System.out.println(s1.toLowerCase());
      System.out.println(s2.compareToIgnoreCase(s1));
      System.out.println(s1.contains("h"));
      System.out.println(s2.substring(1,2));
      System.out.println(s2.startsWith("k"));
      System.out.println(s1.replace('h', 'y'));
      StringBuffer sb=new StringBuffer("basha");
      sb.append("nisar");
      System.out.println(s1);
      System.out.println(sb);
      System.out.println(s3);
	}

	}

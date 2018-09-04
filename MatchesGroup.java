package regularexps;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesGroup {
    /* int n;
    int count;
    
    */
    
    List<Long> list = new ArrayList<Long>();
    List<String> str=new ArrayList<String>();
    List<String> strname=new ArrayList<String>();

    
    String regexMatcher=" mr.vijay Welcome@gmail.com 7675645679 to java 9647484856 435637662006 ms.anitha";
   // String emailMatcher="rengaofficial@gmail.com";
    public static void main(String[] args) {
        
        MatchesGroup mobj=new MatchesGroup();
        mobj.matcherPattern();
    }
        public void matcherPattern()
        {
            Pattern p=Pattern.compile("[789]{1}[0-9]{9}");
            Pattern e_p=Pattern.compile("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}");
            Pattern name=Pattern.compile("[mrsMRS]+\\.[A-Za-z]{1,}");
            Matcher m=p.matcher(regexMatcher);
            Matcher m2=e_p.matcher(regexMatcher);
            Matcher m3=name.matcher(regexMatcher);

            
            while(m.find())
            {
                
                list.add(Long.parseLong(m.group().trim()));
                
            }
           /* long num[]=new long[list.size()];
            for(int i=0;i<list.size();i++)
            {
                
                num[i]=list.get(i);
                System.out.println( "MOBILE NUMBER IS :" + num[i]);
            }*/
            
            for(long l:list)
            {
            	System.out.println(l);
            }
            
            
            //e-mail
           while(m2.find())
            {
                
                str.add(m2.group().trim());
                
            }
           for(String s:str)
           {
           	System.out.println(s);
           }
          
          /*  for(int i=0;i<str.size();i++)
            {
            System.out.println((str.get(i)).toString());
            }
            
            String mail[]=new String[str.size()];
            
            for(int i=0;i<str.size();i++)
            {
                
                mail[i]=str.get(i);
                System.out.println(mail[i]);
            }*/
                
           while(m3.find())
           {
               
               strname.add(m3.group().trim());
               
           }
          for(String n:strname)
          {
          	System.out.println(n);
          }
        
        }
        
        

}


package exercises;

import java.util.Scanner;

public class Project1 {
	static String name1,city1,email1,qual1,source1,source2,gname,others1,cname,
	contact1,refer1,program1,program2,fname1,mname1,exp,exp1,nname,exam,sname,mstatus,skill,id,dept,addr,
	course1,dob;
	static long mob1,pcode;
	static int year1,idnum,percent1,tenth,twelth,expyear,ug;
	
	public static void main(String[] args)
	{   	    System.out.println(" ");
				System.out.println(" ");

	
	
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        System.out.println(" ");

	
		System.out.println("                                             ***  WELCOME TO BIX ACADEMY ***                                   PH:9551110186");
        System.out.println(" ");
        System.out.println("                                                 < ACCELERATING DREAMS>                                        www.bixitacademy.com");

	    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

	    System.out.println(" ");
		System.out.println("Please Select The Following : ");
	    System.out.println(" ");
	    System.out.println(" * ENQUIRY ");
	    System.out.println(" ");
	    System.out.println(" * REGISTRATION");
	    System.out.println(" ");

		Scanner scan = new Scanner(System.in);
		String type1=scan.next();
		if (type1.equalsIgnoreCase("ENQUIRY"))
		{
			System.out.println("Enter the name ");
			name1=scan.next();
			System.out.println("QUALIFICATION ");
            qual1=scan.next();
            System.out.println("year of completion");
            year1=scan.nextInt();
            System.out.println("Percentage");
            percent1=scan.nextInt();
            System.out.println("Enter your city name");
			city1=scan.next();
			System.out.println("Email ID ");
			email1=scan.next();
			System.out.println("MOBILE NO ");
			mob1=scan.nextLong();
			System.out.println("THE TRAINING PROGRAM THAT YOU ARE INTERESTED IN");
			System.out.println("Java Python Selenium MobileApplicationDevelopment Mysql Aptitude others");
			program1=scan.next();
			program2=program1.toLowerCase();
			switch(program2)
			{
			case "java" :
				program2="java";
				break;
			case "python" :
				program2="python";
				break;
			case "selenium" :
				program2="selenium";
				break;
			case "mobileapplicationdevelopment" :
				program2="";
				break;
			case "mysql" :
				program2="mysql";
				break;
			case "aptitude" :
				program2="aptitude";
				break;
			case "others" :
				System.out.println("Enter Your Course NAME :");
				course1=scan.next();
				program2=course1;
				break;
			}	    System.out.println(" ");

			System.out.println("Enter the name of the person who had contacted from BIX ");
			contact1=scan.next();
			System.out.println("Enter the name of the person who had Referred you to BIX ");
            refer1=scan.next();
			System.out.println("the Source through which you know about Our BIX");
			System.out.println(" ");
			System.out.println("Select and type one of this");
			System.out.println("Google UrbanPro Banner JustDial Mailer Sulekha Quikr Others");
			source1=scan.next();
			source2=source1.toLowerCase();
			switch(source2)
			{
			case "google":
				source2="Google";
				break;
			case "urbanpro":
				source2="urbanpro";
				break;
			case "banner":
				source2="banner";
				break;
			case "justdial":
				source2="justdial";
				break;
			case "mailer":
				source2="mailer";
				break;
			case "quikr":
				source2="quikr";
				break;
			case "sulekha":
				source2="sulekha";
				break;
			case "others":
				System.out.println("pls specify urs");
				others1=scan.next();
				source2=others1;
				break;
			}
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("             ***  ENQUIRY FORM DETAILS ***");
		    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

		    System.out.println(" ");

			System.out.println(" * NAME                       :" + name1.toUpperCase());
		    System.out.println(" ");

			System.out.println(" * QUALIFICATION              : "+qual1 );
		    System.out.println(" ");

			System.out.println(" * YEAR OF COMPLETION         : "+year1);
		    System.out.println(" ");

			System.out.println(" * YOUR INTERESTED PROGRAM    : "+program2 );
		    System.out.println(" ");

            System.out.println(" * CITY                       : "+city1.toUpperCase());
		    System.out.println(" ");

			System.out.println(" * EMAIL-ID                   : "+email1.toUpperCase());
		    System.out.println(" ");

			System.out.println(" * MOBILE-NO                  : "+mob1);
		    System.out.println(" ");

			System.out.println(" * PERSON CONTACTED FROM BIX  : "+contact1);
		    System.out.println(" ");

			System.out.println(" * PERSON REFERRED YOU TO BIX : "+refer1);
		    System.out.println(" ");

            System.out.println(" * YOUR BIX SOURCE            : "+source2.toUpperCase());
		    System.out.println(" ");
		    System.out.println(" ");
			System.out.println("             ***  THANK YOU ***");


		    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");


            
          }
		
		else if(type1.equalsIgnoreCase("REGISTRATION"))
			
		{   	    System.out.println(" ");

			System.out.println("Enter the Follwoing Details");
			System.out.println("Canditates Name : ");
			name1=scan.next();
			System.out.println("Gender :  ");
            gname=scan.next();
			System.out.println("ID number :  ");
            idnum=scan.nextInt();
			System.out.println("Course name : ");
			course1=scan.next();
			System.out.println("Date of Birth:  ");
            dob=scan.next();
			System.out.println("Father's Name :  ");
			fname1=scan.next();
			System.out.println("Mother's Name :  ");
			mname1=scan.next();
			System.out.println("Marital Status :  ");
            mstatus=scan.next();
            System.out.println("Last Exam Passed :  ");
            exam=scan.next();
			System.out.println("College/University name :  ");
           cname=scan.next();
			System.out.println("Year of Passing :  ");
            year1=scan.nextInt();
			System.out.println("10th Percentage :  ");
			tenth=scan.nextInt();
			System.out.println("12th Percentage:  ");
			twelth=scan.nextInt();
			System.out.println("UG percentage :  ");
			ug=scan.nextInt();
			System.out.println("Are You Experienced :  ");
            exp=scan.next();
            if(exp.equalsIgnoreCase("yes"))
            {
            	
    			System.out.println("Employee ID :  ");
                id=scan.next();
    			System.out.println("Primary Skills :  ");
                skill=scan.next();
                System.out.println("no of years");
            	expyear =scan.nextInt();
            	System.out.println("IT or NON-IT");
            	dept=scan.next();
         
            	
            }
            else if(exp.equalsIgnoreCase("no"))
            {
            	exp1="FRESHER";
            }
            else
            {
            	System.out.println("Only Yes or NO allowed");
            }

			System.out.println("Address For Communication : ");
			addr=scan.next();
			System.out.println("City :");
			city1=scan.next();
			System.out.println("State : ");
		    sname=scan.next();
			System.out.println("PinCode : ");
			pcode=scan.nextLong();
			System.out.println("Nationality :  ");
            nname=scan.next();
			System.out.println("Email-ID ");
			email1=scan.next();
			System.out.println("Mobile-No : ");
			mob1=scan.nextLong();
		    System.out.println(" ");


			System.out.println("        *** REGISTRATION FORM DETAILS ***");
		    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

		    System.out.println(" ");

			System.out.println(" * CANDITATE NAME         : " + name1);
		    System.out.println(" ");

			System.out.println(" * GENDER                 : "+ gname);
		    System.out.println(" ");

			System.out.println(" * ID-NUMBER              : " + idnum);
		    System.out.println(" ");

			System.out.println(" * DATE OF BIRTH          : "+ dob);
		    System.out.println(" ");

			System.out.println(" * FATHER'S NAME          : "+ fname1);
		    System.out.println(" ");

			System.out.println(" * MOTHER'S NAME          : "+ mname1);
		    System.out.println(" ");

			System.out.println(" * MARITAL STATUS         : "+ mstatus);
		    System.out.println(" ");

			System.out.println(" * LAST EXAM PASSED        : "+ exam);
		    System.out.println(" ");

			System.out.println(" * COLLEGE/UNIVERSITY NAME : "+ cname);
		    System.out.println(" ");

			System.out.println(" * YEAR OF PASSING         : "+ year1);
		    System.out.println(" ");

			System.out.println(" * 10TH PERCENTAGE         : "+ tenth);
		    System.out.println(" ");

			System.out.println(" * 12TH PERCENTAGE         : "+ twelth);
		    System.out.println(" ");

			System.out.println(" * UG PERCENTAGE            : "+ ug);
		    System.out.println(" ");

			if(exp.equalsIgnoreCase("yes"))
            {
            System.out.println(" * EXPERIENCE               : Employee-ID : "+ id + " With the " + skill + " Of " + expyear + " Experiences in "+ dept + " Field ");
		    System.out.println(" ");

            }
            else if(exp.equalsIgnoreCase("no"))
            {
            	System.out.println(" * EXPERIENCE             : " +exp1);
    		    System.out.println(" ");

            }

			System.out.println(" * ADDRESS FOR COMMUNICATION  : "+ addr);
		    System.out.println(" ");

			System.out.println(" * CITY                       : "+ city1);
		    System.out.println(" ");

			System.out.println(" * STATE                      : "+ sname);
		    System.out.println(" ");

			System.out.println(" * PINCODE                    : "+pcode);
		    System.out.println(" ");

			System.out.println(" * NATIONALITY                : "+nname);
		    System.out.println(" ");

			System.out.println(" * EMAIL-ID                   : "+email1);
		    System.out.println(" ");

			System.out.println(" * MOBILE-NO                  : "+id);
		    System.out.println(" ");
		    System.out.println(" ");
			System.out.println("             ***  THANK YOU ***");


		    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");




      }
		else
		{
			System.out.println(" * INVALID FORM SELECTION..TRY AGAIN");
		}

	}

}

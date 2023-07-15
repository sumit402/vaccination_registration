import java.util.Scanner;
public class root {

	public static void main(String[] args) {
        int  choice,age,n,otp,yes,c;
		 String name,lname,gender,h;
		 System.out.println("Enter your choice\n");
		System.out.println("\n1.for the registration\n2.for the slot booking\n3.for the dose checking\n4.for the age verification\n5.for the  exit");
		Scanner Scan=new Scanner(System.in);
		choice=Scan.nextInt();
		switch(choice)
		
		{
		case 1:
			System.out.println("-------------------------------------------");
			System.out.println("!!!WELCOME TO THE REGISTTRATION PORTAL!!!!");
			System.out.println("------------------------------------------");
			System.out.println("\nEnter your First name\n");
			Scanner Scan2=new Scanner(System.in);
			name=Scan.next();
            System.out.println("\nEnter your Last name");
            lname = Scan.next();
			System.out.println("\nEnter your age\n");
			Scanner Scan4=new Scanner(System.in);
			age=Scan.nextInt();
			System.out.println("\nEnter your gender\n");
			Scanner Scan6=new Scanner(System.in);
			gender=Scan.next();
			System.out.println("\nEnter your aadhar number\n");
			Scanner Scan8=new Scanner(System.in);
			n=Scan.nextInt();
			System.out.println("\nEnter the otp to verify\n");
			Scanner Scan1=new Scanner(System.in);
			otp=Scan1.nextInt();
			System.out.println("!!YOU HAVE SUCESSFULLY COMPLETED YOUR REGISTRATION!!");
			System.out.println("------------------Thanks for visiting----------------");
            break;
		case 2:
			System.out.println("You are looking for the slot");
			System.out.println("Enter the name of  your nearby govt hospital\n");
			h=Scan.next();
            System.out.println("\n1.PMCH-100(covishield)\n2.GARDNER-150(covishield)\n3.IGIMS-200(covishield)\n4.NMCH-120(covishield)");
            break;
		case 3:
			System.out.println("!!Plz enter the details\n!!");
			System.out.println("\n1.for the yes\n2.for the no");
			System.out.println("Enter whether you are taken first dose or not\n");
            c=Scan.nextInt();
            
	        if(c==1)
            {
            	System.out.println("You need to wait for the 84 days ");
            }
            else
            {
            	System.out.println("You need to book the slot for the vaccination");
            }
            break;
		case 4:
			
			System.out.println("Plz verify your age\n");
			System.out.println("Enter your age\n");
			 age=Scan.nextInt();
            if(age>=45)
            {
            	System.out.println("You  are eligible to take the vacicne");
            }
            else if(age>=18&age<45)
            {
            	System.out.println("You all need to wait for your turn");
            }
            else
            {
            	System.out.println("You all are in under age below 18 years");
            }
            break;
		case 5:
			System.out.println("!!--------------------------THANKS FOR VISITING!!-----------------------------------");
            break;
            default:
            	System.out.println("!!Plz choose the valid option for the process!!");
            
            
            
            
            
			
		}
	}
}
/*Name -> Shwetank Singh Enrollment ID -> 99110 Student ID -> 88020
Project -> ATM Console Application
*/
import java.util.*;
class Atm2
{
	public int menudrive(String name , int pass , int amt , int tran , int bal)
	{
		Scanner str = new Scanner(System.in);//Input Scanner for String
		Scanner in = new Scanner(System.in);//Input Scanner for Integer 
		System.out.println("Enter your choice from following");
		System.out.println("1.Deposit in Account\n2.Withdraw in Account\n3.Balance Enquiry\n4.Last Transaction\n5.Exit");
		System.out.print("Choice : ");
		int ch = in.nextInt();//ch -> Choice for bank process
		int i = 3,p,add,sub;//p->Password registerd , sub->subtract operation , add->addition operation
		String n,c,c2;//n->Name Input , c and c2 are input strings
		char c1,c3;//c1 and c3 are container that store string to character
		switch(ch)
		{
			case 1:
			do
			{
			    System.out.print("Enter Registered Name : ");
		        n = str.nextLine();//n -> Name registered
		        System.out.print("Enter Password : ");
		        p = in.nextInt();//p -> Password registerd
		        if(n.equals(name) && p == pass)
		        {
			        System.out.println("Enter the amount to be Deposited in account");
			        add = in.nextInt();//add -> Balance deposited in A/C
			        if(add%100==0)
			        {
			            amt = add + amt;
			            System.out.println("Do you wish to print details : Y/N");
			            c=str.next();//Inputs String
			            c1=c.charAt(0);
			            if(c1 =='Y'||c1 =='y')
			            {
				            System.out.println("Balance in your account : "+amt);
			            }
			            //return amt;
			        }
			        else
			        {
			       	    System.out.println("Please Enter valid amount");
			       	    continue;
			        }
			            break;
		        }
		        else
		        {
			        i--;
			        System.out.println("Incorrect Password/Name");
			        if(i==0)
			        {
				        System.out.println("You have used your chances. Please contact your bank");
			        }
			        else
			        {
			            System.out.println(i+" Chance left");
			        }
		        }   
	        } while(i!=0);
			break;
			case 2:
			do
			{
			    System.out.print("Enter Registered Name : ");
		        n = str.nextLine();
		        System.out.print("Enter Password : ");
		        p = in.nextInt();
		        if(n.equals(name) && p == pass)
		       {
			        System.out.println("Enter the amount to be Withdrawn from account");
			        sub = in.nextInt();
			        if(sub%100==0)
			        {
			            if(amt!=0)
			            {
			                amt = amt - sub;
			                System.out.println("Do you wish to print details : Y/N");
			                c2=str.next();//Inputs String
			                c3=c2.charAt(0);
			                if(c3 =='Y'||c3 =='y')
			                {
				                System.out.println("Balance in your account : "+amt);
				                //return amt;
			                }
			                break;
			            }
			            else
		                {
		    	            System.out.println("Due to Insufficient Balance your query cannot be processed");
		    	            break;
		                }
		            }
		            else
		            {
		            	System.out.println("Please Enter valid amount");
		            	continue;
		            }
		        }
		        else
		        {
			        i--;
			        System.out.println("Incorrect Password/Name");
			        if(i==0)
			        {
		                System.out.println("You have used your chances. Please contact your bank");
			        }
			        else
			        {
		                System.out.println(i+" Chance left");
			        }
		        }
	        } while(i!=0);
			break;
			case 3:
			do
			{
			    System.out.print("Enter Registered Name : ");
		        n = str.nextLine();
		        System.out.print("Enter Password : ");
		        p = in.nextInt();
		        if(n.equals(name) && p == pass)
		        {
			        System.out.println("Balance in your account : "+amt);
			        break;
		        }
		        else
		        {
			        i--;
			        System.out.println("Incorrect Password/Name");
			        if(i==0)
			        {
				        System.out.println("You have used your chances. Please contact your bank");
			        }
			        else
			        {
			            System.out.println(i+" Chance left");
			        }
		        }
	       } while(i!=0);
			break;

		    case 4:do
			{
			    System.out.print("Enter Registered Name : ");
		        n = str.nextLine();
		        System.out.print("Enter Password : ");
		        p = in.nextInt();
		        if(n.equals(name) && p == pass)
		        {
			        System.out.println("Your Last Transaction");
			        if(bal>tran)
			        {
			        	System.out.println("Withdraw : "+tran);
			        }
		            else if(bal<tran)
		            {
		            	System.out.println("Deposit : "+tran);
		            }
		            System.out.println("Balance in your account : "+amt);
		            break;    
		        }
		        else
		        {
			        i--;
			        System.out.println("Incorrect Password/Name");
			        if(i==0)
			        {
		                System.out.println("You have used your chances. Please contact your bank");
			        }
			        else
			        {
		                System.out.println(i+" Chance left");
			        }
		        }
	        } while(i!=0);
			break;

			case 5:
			do
			{
			    System.out.print("Enter Registered Name : ");
		        n = str.nextLine();
		        System.out.print("Enter Password : ");
		        p = in.nextInt();
		        if(n.equals(name) && p == pass)
		        {
			        System.out.println("You have Logged off");
		            break;
		        }
		        else
		        {
			        i--;
			        System.out.println("Incorrect Password/Name");
			        if(i==0)
			       {
				        System.out.println("You have used your chances. Please contact your bank");
			       }
			       else
			       {
			            System.out.println(i+" Chance left");
			       }
		        } 
	        } while(i!=0);
		    break;
			
			default:System.out.println("Invalid Choice. Please choose a valid option");
			break;
		}
		return amt;
	}
	public static void main(String args[])
	{
		Atm2 obj = new Atm2();//object of atm obj is created
		Scanner sc = new Scanner(System.in);//Input Scanner for String in main
		Scanner s = new Scanner(System.in);//Input Scanner for Integer in main
		System.out.println(" Login Info ");
		System.out.println("-------------");
		System.out.print("Enter Name : ");
	    String name = sc.nextLine();//name-> Input container for name to be registered
	    System.out.print("Enter Password : ");
	    int pass = s.nextInt();//pass-> Input container for password to be registered
	    int amt = 0 ,a,bal = 0,tran = 0;//a-> value return from the function menudrive
	    //bal-> container to contain the value of amt
	    //tran-> keep the transaction value of money
	    //amt -> container to contain the value of a
	    char ch;//ch is container that store string to character
	    String c;//Input String
	    do
		{
	        a = obj.menudrive(name,pass,amt,tran,bal);
	        System.out.println("Do you wish to continue Y/N");
	        c=sc.next();//Inputs String
		    ch=c.charAt(0);
		    bal = amt;
		    if(a>amt)
		    {
		    	tran = a - bal;
		    }
		    else if(a<amt)
		    {
		    	tran = bal - a;
		    }
		    amt = a;
	    } while(ch=='y'||ch=='Y');
	}
}
import java.util.*;
class AtmTest
{
	public int menudrive(String na , int pa)
	{
		Scanner str = new Scanner(System.in);//Input Scanner for String
		Scanner in = new Scanner(System.in);//Input Scanner for Integer
		Scanner cha = new Scanner(System.in);
		System.out.println("Enter your choice from following");
		System.out.println("1.Deposit in Account\n2.Withdraw in Account\n3.Balance Enquiry\n4.Exit");
		System.out.print("Choice : ");
		int ch = in.nextInt();//ch -> Choice for bank process
		int i = 3,p,add,sub;
		String n,c,c2;
		char c1,c3;
		switch(ch)
		{
			case 1:
			do
			{
			    System.out.print("Enter Registered Name : ");
		        n = str.nextLine();//n -> Name registered
		        System.out.print("Enter Password : ");
		        p = in.nextInt();//p -> Password registerd
		        if(n.equals(na) && p == pa)
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
		        if(n.equals(na) && p == pa)
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
		        if(n.equals(na) && p == pa)
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

			case 4:
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
	}
	public static void main(String args[])
	{
		Atm2 obj = new Atm2();
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.println(" Registration ");
		System.out.println("---------------");
		System.out.print("Enter Name : ");
	    String name = sc.nextLine();
	    System.out.print("Enter Password : ");
	    int pass = s.nextInt();
	    int amt = 0 ;
	    char ch;
	    String c;
	    do
		{
	        obj.menudrive(name,pass);
	        System.out.println("Do you wish to continue Y/N");
	        c=sc.next();//Inputs String
		    ch=c.charAt(0);
	    } while(ch=='y'||ch=='Y');
	}
}
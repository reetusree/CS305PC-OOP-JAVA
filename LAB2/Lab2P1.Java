import java.util.Scanner;
class Lap2P1
{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		//s.nextLine();
	        String op = s.nextLine();
	              	switch(op){
	              		case"++":
	              		 System.out.println("pre:" + (++a));
	              	         System.out.println("post:" + (a++));
	              	         break;
	                         case"--":
	              		 System.out.println("pre:" + (--a));
	              	         System.out.println("post:" +(a--));
	              	         break;
	                         case"+":
	                              a = +a;
	              		      System.out.println("Unary +:" + (a));
	              	         break;
	                         case"-":
	                              a = -a;
	              		      System.out.println("Unary +:" + (a));
	              	         break;
	              	         default:
	              	              System.out.println("enter the incorrect unary");
	              	            }
	              	        }
	              	        }


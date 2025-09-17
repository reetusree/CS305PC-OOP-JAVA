import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	String b = s.next();
	Lab3P4 l = new Lab3P4();
	Lab3P4 l1 = new Lab3P4(a);
	Lab3P4 l2 = new Lab3P4(b);
	Lab3P4 l2 = new Lab3P4(a,b);
		l.display();l.display(10);l.display("String");l.display(10,"String");
	}
	public void show(){
		System.out.println("Constructor without params");
	}
	public void show(int x){
		System.out.println("Constructor with int params:"+ x);
	}
	public void show(String s){
		System.out.println(" Constructor with String params:"+s);
	}
	public void show(int x,String s){
		System.out.println("Constructor with two params int and String:"+ x +" "+ s);
	}
		}
		
		


		


		


		


		
		

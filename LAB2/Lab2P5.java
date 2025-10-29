import java.util.Scanner;
class Lab2P5{
	public static void main (String...args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	boolean p =true;
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				p=false;
				break;
		}
}
if(p){
System.out.println("It is a prime number");
}
else{
System.out.println("It is not a prime number");
}
}
}

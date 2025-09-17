import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	Lab3P4 l = new Lab3P4();
	Lab3P4 l1 = new Lab3P4(a);
	Lab3P4 l2 = new Lab3P4(b);
	Lab3P4 l3 = new Lab3P4(a,b);

	l.Display(); l.Display(10); l.Display("String"); l. Display(10,"String");
	}
	Lab3P4(){
		System.out.println("Method without params");
		}
	Lab3P4(int x){
			System.out.println("Method without params: "+x);
		}
	Lab3P4(String s){
			System.out.println("Method with String params: "+s);
		}
	Lab3P4(int x,String s){
			System.out.println("Method with two params int and String: "+ x +""+s);
		} 
	}

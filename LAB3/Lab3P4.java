import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
	Lab3P4 l = new Lab3P4();
	l.display(); l.display(10); l.display("String"); l.display(10,"String");
	}
	
		public void show(){
		System.out.println("Method without params");
		}
		public void show(int x){
			System.out.println("Method without params: "+x);
		}
		public void show(String s){
			System.out.println("Method with String params: "+s);
		}
		public void show(int x, String s){
			System.out.println("Method with two params int and String: "+ x +""+s);
		} 
	}


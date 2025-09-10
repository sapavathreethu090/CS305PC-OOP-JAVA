import java.util.*;
class Lab2P5{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		boolean p=true;
		for(int i=2;i<x/2;i++){
			if(x%i==0){
				p =false;
				break;
			}
		}
		if(p){
			System.out.println("it is a prime number:");
		}
		else{
			System.out.println("it is not prime");
		}
	}
}

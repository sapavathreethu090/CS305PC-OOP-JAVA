import java.util.Scanner;
class Lab3P2{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
		for(int i=2;i<x/2;i++){
		if(x%i==0){
			x =false;
			break;
			}
		}
		if(x){
			System.out.println("it is a prime number:");
		}
		else{
			System.out.println("it is not prime");
		}
	}
}

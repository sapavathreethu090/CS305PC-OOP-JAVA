import java.util.*;
class Lab2P2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.println("Output is: "+ x++ + ++x);
			System.out.println("Output is: "+ (x++ + ++x));
			System.out.println(x++ + ++x + "Output is:");
	}

}

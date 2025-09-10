import java.util.*;
class Lab2P1{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
			int x = s.nextInt();
			s.nextLine();
			String op = s.next();
			switch(op){
				case"++":
					System.out.println("pre: "+ (++x));
					System.out.println("post: "+ (x++));
					break;
				case"--":
					System.out.println("pre: "+ (--x));
					System.out.println("post: "+ (x--));
					break;
				case"+":
					System.out.println(+x);
					break;
				case"-":
					System.out.println(-x);
					break;
				case"~":
					System.out.println(~x);
					break;
				default:
					System.out.println("you have entered the wrong operator");
		}	
	}	
}

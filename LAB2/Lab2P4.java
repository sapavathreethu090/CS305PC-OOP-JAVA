import java.util.*;
class Lab2P4{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println((x&y)+","+(x^y));
	}

}

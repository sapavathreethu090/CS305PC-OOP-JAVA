enum Colors{
	Red,Blue,Yellow,Black;
}
public class EnumCo{
	public static void main(String...args){
		for(Colors c: Colors.values()){
			System.out.println(c);
		}
	}
}

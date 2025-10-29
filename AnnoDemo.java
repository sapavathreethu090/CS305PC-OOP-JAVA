class AnnoP{
	@Deprecated
	public void depM(){
		System.out.println("Deprecated Method");
	}
	public void ovR(){
		System.out.println("AnnoP");
	}
}
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("AnnoC");
		}
	}
public class AnnoDemo{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
		AnnoC ac = new AnnoC();
		ac.ovR();
		ac.depM();
	}
}
	

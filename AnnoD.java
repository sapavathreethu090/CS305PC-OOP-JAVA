import java.lang.Annotation.*;
class AnnoP{
	@Deprecated
	public void depM(){
		System.out.println("Deprecated Method");
	}
	public void ovR(){
		System.out.println("AnnoP");
	}
}
@MyAnno("My ANNO DEF")
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("AnnoC");
		}
	}
public class AnnoD{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
		AnnoC ac = new AnnoC();
		ac.ovR();
		ac.depM();
		System.out.println("ct.isAnnotationPresent(myAnno.class)");
		System.out.println("ct.getAnnotationType(myAnno.class)");
	}
}

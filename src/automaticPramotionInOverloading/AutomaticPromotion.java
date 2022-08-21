package automaticPramotionInOverloading;

public class AutomaticPromotion {
	
	public void m1(int i) {
	System.out.println("int arg method");	
	}
	
	public void m1(float f) {
		System.out.println("float f");
	
	}
	public static void main(String[] args) {
		
		AutomaticPromotion a= new AutomaticPromotion();
		a.m1(5);
		a.m1(19.5f);
		a.m1('a');
	}
	
}

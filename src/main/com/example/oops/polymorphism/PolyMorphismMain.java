package main.com.example.oops.polymorphism;

public class PolyMorphismMain {


	public static void main(String ...args) {
		
		System.out.println("----- Runtime PolyMorphism -----");
		MobileApp mobileApp;
		
		mobileApp= new AndroidApp();
		mobileApp.showLanguage();
		mobileApp= new IosApp();
		mobileApp.showLanguage();
		
		
		System.out.println("----- Compile PolyMorphism -----");
		
		Shape shape = new Shape();
		shape.getArea(4.0);
		shape.getArea(4.0,5.0);
	}
}


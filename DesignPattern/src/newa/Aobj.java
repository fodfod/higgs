package newa;

public class Aobj {
	
	Ainterface ainterface;
	
	public Aobj() {
		ainterface = new AinterfaceIpl();
	}
	
	public void funcAA() {
		
		//다른 객체를 이용하여 기능 사용 = 위임한다
		ainterface.funca();
		ainterface.funca();
//		System.out.println("AAA");
//		System.out.println("AAA");
		
		// ~기능이 필요합니다. 개발해주세요
	}
}

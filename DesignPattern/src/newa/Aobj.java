package newa;

public class Aobj {
	
	Ainterface ainterface;
	
	public Aobj() {
		ainterface = new AinterfaceIpl();
	}
	
	public void funcAA() {
		
		//�ٸ� ��ü�� �̿��Ͽ� ��� ��� = �����Ѵ�
		ainterface.funca();
		ainterface.funca();
//		System.out.println("AAA");
//		System.out.println("AAA");
		
		// ~����� �ʿ��մϴ�. �������ּ���
	}
}

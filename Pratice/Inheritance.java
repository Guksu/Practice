class practice{
	 
	public double sum(double a1, double a2) {
			return(a1+a2);
	}
	
}

class practice2 extends practice{
	public double minus(double a1, double a2) {
		return a1-a2;
	}
	
	//�̰��� overriding(������)�̶��Ѵ�
	public double sum(double a1, double a2) {
		System.out.println("This is Heritance!");
		return a1 +a2;
//		�Ʒ��� �ڵ�� �θ� class�� �޼ҵ�(sum)�� ȣ���ؼ� �����Ѵ�.
//		return super.sum(a1,a2);
	}
//		�̰��� Overloading�̶��Ѵ�.
		public double sum(double a1, double a2, double a3) {
			return(a1+a2+a3);
//		�� �ڵ�� sum(a1,a2)�ڵ��� ���� a3�� ���Ѵ�. this�� �ڽ��� class�� �޼ҵ带 ��ȯ�ϴ°�.
//			return this.sum(a1,a2)+a3;	
	}
}

public class Inheritance {
	
	
	public static void main(String[] args) {
			practice a = new practice();
			System.out.println(a.sum(4,5));
			
			practice2 b = new practice2();
			System.out.println(b.sum(4,5));
			
		
		
		
		
		
	}
}

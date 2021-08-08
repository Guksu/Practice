class practice{
	 
	public double sum(double a1, double a2) {
			return(a1+a2);
	}
	
}

class practice2 extends practice{
	public double minus(double a1, double a2) {
		return a1-a2;
	}
	
	//이것은 overriding(재정의)이라한다
	public double sum(double a1, double a2) {
		System.out.println("This is Heritance!");
		return a1 +a2;
//		아래의 코드는 부모 class의 메소드(sum)을 호출해서 실행한다.
//		return super.sum(a1,a2);
	}
//		이것은 Overloading이라한다.
		public double sum(double a1, double a2, double a3) {
			return(a1+a2+a3);
//		이 코드는 sum(a1,a2)코드의 값에 a3를 더한다. this는 자신의 class의 메소드를 소환하는것.
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

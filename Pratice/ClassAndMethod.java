class Accounting{
//	public static double valueOfSupply;
//    public static double vatRate = 0.1;
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    } 
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }
//}    �ν��Ͻ��� ���������Ƿ� static�� ����
	
//	public  double valueOfSupply;
//	public static double vatRate = 0.1;
//	public  double getVAT() {
//      return valueOfSupply * vatRate;
//	} 
//	public  double getTotal() {
//      return valueOfSupply + getVAT();
//	}
//}   this�� ������
	public  double valueOfSupply;
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public static double vatRate = 0.1;
	public  double getVAT() {
		return valueOfSupply * vatRate;
	} 
	public  double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class ClassAndMethod {
    public static void main(String[] args) {
//    	Accounting.valueOfSupply = 10000.0;
//    	System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());
//       �ν��Ͻ� ����
//    	Accounting a1 = new Accounting();
//    	a1.valueOfSupply = 10000.0;
//    	System.out.println("Value of supply : " + a1.valueOfSupply);
//    	System.out.println("VAT : " + a1.getVAT());
//    	System.out.println("Total : " + a1.getTotal());
    	//this�� ������
    	Accounting a1 = new Accounting(10000.0);
    	System.out.println("Value of supply : " + a1.valueOfSupply);
    	System.out.println("VAT : " + a1.getVAT());
    	System.out.println("Total : " + a1.getTotal());

    	Accounting a2 = new Accounting(20000.0);
    	System.out.println("\nValue of supply : " + a2.valueOfSupply);
    	System.out.println("VAT : " + a2.getVAT());
    	System.out.println("Total : " + a2.getTotal());

    	  	
    }	
}
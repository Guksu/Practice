
public class Method {
								//text��number�� �Ű����� Ȥ�� parameter
//	public static void printNew(String text, String number) {
//		System.out.println(number);
//		System.out.println(text);
//		System.out.println(text);
//	}
	
	public static String printNew(String text, int number) {
		//""�ȿ� ���ڸ� ������ ���� ���� ��µ� ������ ""�ȿ� �����̹Ƿ� �ƹ��͵� ����� �� �Ǵ� ����
		String out = "";
		out = out + number + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
   
		return out ;
		
	}
	
				//return���� �޼ҵ�� ����
	public static String a() {
		return "a";
	}
	public static int one() {
		return 1;
	}
	
				//void�� return���� ���� �޼ҵ�
	public static void main(String[] args) {
				//"a"��"1"�� ���� Ȥ�� argument
		System.out.println(printNew("a", 1));
		System.out.println(printNew("b", 2));
		System.out.println(a());
		System.out.println(one());
			
	}

}


public class Method {
								//text와number는 매개변수 혹은 parameter
//	public static void printNew(String text, String number) {
//		System.out.println(number);
//		System.out.println(text);
//		System.out.println(text);
//	}
	
	public static String printNew(String text, int number) {
		//""안에 문자를 넣으면 제일 먼저 출력됨 지금은 ""안에 공백이므로 아무것도 출력이 안 되는 상태
		String out = "";
		out = out + number + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
   
		return out ;
		
	}
	
				//return에서 메소드는 끝남
	public static String a() {
		return "a";
	}
	public static int one() {
		return 1;
	}
	
				//void는 return값이 없는 메소드
	public static void main(String[] args) {
				//"a"와"1"은 인자 혹은 argument
		System.out.println(printNew("a", 1));
		System.out.println(printNew("b", 2));
		System.out.println(a());
		System.out.println(one());
			
	}

}

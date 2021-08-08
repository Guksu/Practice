

public class Bolleanapp {
	public static void main(String[] args) {

//		String Id = "min" ;
//		String inputId = args[0] ;
//		String pass = "1234" ;
//		String pass2= "4321";
//		String inputPass = args[1] ;
		
		
		
//		if(inputId.equals(Id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("hello!");
//			}else {
//				System.out.println("Wrong Pass");
//			}
//		}
//		else {
//			System.out.println("get out!");
//		}
//		

//		if(inputId.equals(Id) &&(inputPass.equals(pass) || inputPass.equals(pass2)) ){
//			System.out.println("hello!");
//		} else {
//			System.out.println("get out!");			
//		}
		
		
//		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2)) ;
//		if(inputId.equals(Id) && isRightPass ){
//			System.out.println("hello!");
//		} else {
//			System.out.println("get out!");			
//		}
		
//     아래부턴 응용
//		String[] name = {"one", "two","three"};
//		String inputName = args[0] ;
//		
//		
//		boolean  islogined =false;
//		for(int i=0; i<name.length; i=i+1 ) {
//			String chekingName = name[i];
//			if(chekingName.equals(inputName)) {
//				islogined=true;
//				break;
//			}
//		}
//		System.out.println("Hi!");
//		if(islogined) {
//			System.out.println("Wellcom!");
//		}
//		else {
//			System.out.println("Get Out!!");
//		}
		
		
		String[][] name = {
				{"one", "1111"},
				{"two", "2222"},
				{"three","3333"}
			};
		String inputName = args[0] ;
		String inputPass = args[1] ;
// 위의 반복문에서 String에 []을 추가해야함!
		boolean  islogined =false;
		for(int i=0; i<name.length; i=i+1 ) {
			String[] cheking = name[i];
			if(
					cheking[0].equals(inputName) &&
					cheking[1].equals(inputPass)
					) {
				islogined=true;
				break;
			}
		}
		System.out.println("Hi!");
		if(islogined) {
			System.out.println("Wellcom!");
		}
		else {
			System.out.println("Get Out!!");
		}
		
		
	}
}

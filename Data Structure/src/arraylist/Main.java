package arraylist;

public class Main {

	public static void main(String[] args) {
		Arraylist numbers = new Arraylist() ;
		numbers.addLast(10);		
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addFirst(5);
		numbers.add(2, 15);
		numbers.remove(1);
		//위에 있는 순서대로 적용
		
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		System.out.println(numbers.locateindex(20));
		System.out.println("-----");
		//element를 순서대로 출력하는 코드
		Arraylist.ListIterator li = numbers.listIterator(); //listIterator는 메소드 // ListIterato는 데이터 타입

//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
		while(li.hasNext()) {
			System.out.println(li.next()); //li.next를 먼저 호출하기전에 li.hasNext를 먼저 호출한다.
		}
		
	}
}

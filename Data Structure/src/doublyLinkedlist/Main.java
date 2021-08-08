package doublyLinkedlist;

public class Main {

	
	public static void main(String[] args) {
		doublylinkedlist numbers = new doublylinkedlist() ;
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.addLast(40);
//		numbers.add(1,15);
		numbers.removeFirst();
//		System.out.println(numbers.node(3));
//		System.out.println(numbers.removeFirst());//removeFirst를 한번 더 실행시키고 출력한것
//		System.out.println(numbers.remove(2));
		System.out.println(numbers);
//		System.out.println(numbers.indexOf(20));
		
		//맨처음에는 head를 출력하고 그 뒤 순서대로 출력하는 코드
		doublylinkedlist.ListIterator i = numbers.listIterator();
//		System.out.println(i.next()); 
//		System.out.println(i.next());	
//		System.out.println(i.next());
//		
//		//hasNext는 next코드를 더 실행할 수 있는가를 확인하는 코드
//		System.out.println(i.hasNext());
		
//		위의 코드를 단순화 한 코드		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		i.add(4);
//		i.next();
//		i.add(14);	
//		System.out.println(numbers);
		
		while(i.hasNext()) {
			if((int)i.next()== 20) {
				i.remove();
			}
		}
		System.out.println(numbers);
	}
}

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
//		System.out.println(numbers.removeFirst());//removeFirst�� �ѹ� �� �����Ű�� ����Ѱ�
//		System.out.println(numbers.remove(2));
		System.out.println(numbers);
//		System.out.println(numbers.indexOf(20));
		
		//��ó������ head�� ����ϰ� �� �� ������� ����ϴ� �ڵ�
		doublylinkedlist.ListIterator i = numbers.listIterator();
//		System.out.println(i.next()); 
//		System.out.println(i.next());	
//		System.out.println(i.next());
//		
//		//hasNext�� next�ڵ带 �� ������ �� �ִ°��� Ȯ���ϴ� �ڵ�
//		System.out.println(i.hasNext());
		
//		���� �ڵ带 �ܼ�ȭ �� �ڵ�		
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

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
		//���� �ִ� ������� ����
		
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		System.out.println(numbers.locateindex(20));
		System.out.println("-----");
		//element�� ������� ����ϴ� �ڵ�
		Arraylist.ListIterator li = numbers.listIterator(); //listIterator�� �޼ҵ� // ListIterato�� ������ Ÿ��

//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
		while(li.hasNext()) {
			System.out.println(li.next()); //li.next�� ���� ȣ���ϱ����� li.hasNext�� ���� ȣ���Ѵ�.
		}
		
	}
}

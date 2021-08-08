package linkedlist;

public class linkedlist {

	private Node head;
	private Node tail;
	private int size =0;
	private class Node{
		private Object data; //����Ǵ� �����Ͱ� data��� ������ ���� �ϴ� �ڵ�
		private Node next; //next��� ������ Ÿ���� Node���� ����
		public Node(Object input) {
			this.data = input;
			this.next = null;	
		}	
		//Node��� �����Ͱ��� ��������� ȭ��� data�� ������ �ϴ� �ڵ�
		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		//���ο� NodeŬ������ �ν��Ͻ��� ����� �ڵ�
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size ++;
		if(head.next == null) {
			tail = head; 
		}	
	}

	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) {  //�����Ͱ� ���� ��쿡 ������ ���� ������ �� �ڵ带 �߰��ϴ°�)
			addFirst(input);
		}
		else {
			tail.next = newNode;
			newNode = tail;
			size++;
		}
	}

	Node node(int index) {//�ܺο��� �� Node�� ����ϸ� �ȵǹǷ� public�� ����
		Node x = head;
		for (int i =0; i<index ; i++) {
			x=x.next;
		}
		return x;
	}

	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input);
		}
		else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newnode = new Node(input);
			newnode= temp1.next;
			newnode.next= temp2;
			size ++;
			if(newnode.next == null) {
				newnode = tail;
			}
		}
	}

	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str += temp.data+ ",";
			temp= temp.next;
		}
		str += temp.data;
		return str+"]";
	}

	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returndata = temp.data;//����� �����͸� ����ϱ� ���� �ڵ�
		temp= null;
		size --;
		return returndata;//����� �����͸� ����ϱ� ���� �ڵ�
	}

	public Object remove(int k ) {
		if(k ==0) {
			return removeFirst();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next= temp.next.next;
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail=temp;
		}
		todoDeleted = null;
		size --;
		return returnData;
	}	
	
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp= temp.next;
			index ++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	
	public class ListIterator{
		private Node next;
		private Node LastReturned;
		private int nextIndex;
		ListIterator(){
			next=head;
		}
		public Object next() {
			LastReturned=next;
			next= next.next;
			nextIndex++;
			return LastReturned.data;
		}

		public boolean hasNext() {
			return nextIndex < size; 
		}

		public void add(Object input) {
			Node newnode = new Node(input);
			//�� ó���� add�� �ϴ� �ڵ�
			//head =newnode;
			//newnode.next = next;
			//�߰��� add�� �ϴ� �ڵ�
			//LastReturned.next = newnode;
			//newnode.next = next;
			//�� �� �ڵ带 ��ġ�� �ڵ�
			if(nextIndex == 0) {
				head =newnode;
				newnode.next = next;
			}
			else {
				LastReturned.next = newnode;
				newnode.next = next;
			}
			LastReturned = newnode;
			nextIndex++;
			size++;
		}
		public void remove() {
			if (nextIndex == 0) {
				throw new IllegalStateException();  //������� �߰��ϴ� �ڵ�
			}
			else {
				linkedlist.this.remove(nextIndex-1);
				nextIndex --;
			}
		}
	}
	public ListIterator listIterator() {
		return new ListIterator();
	}
}


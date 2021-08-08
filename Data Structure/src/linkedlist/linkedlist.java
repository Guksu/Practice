package linkedlist;

public class linkedlist {

	private Node head;
	private Node tail;
	private int size =0;
	private class Node{
		private Object data; //저장되는 데이터가 data라는 변수에 들어가게 하는 코드
		private Node next; //next라는 변수의 타입은 Node임을 지정
		public Node(Object input) {
			this.data = input;
			this.next = null;	
		}	
		//Node라는 데이터값을 출력했을떄 화면상 data가 나오게 하는 코드
		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		//새로운 Node클래스의 인스턴스를 만드는 코드
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
		if(size == 0) {  //데이터가 없는 경우에 오류가 나기 때문에 이 코드를 추가하는것)
			addFirst(input);
		}
		else {
			tail.next = newNode;
			newNode = tail;
			size++;
		}
	}

	Node node(int index) {//외부에서 이 Node를 출력하면 안되므로 public을 삭제
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
		Object returndata = temp.data;//사라진 데이터를 출력하기 위한 코드
		temp= null;
		size --;
		return returndata;//사라진 데이터를 출력하기 위한 코드
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
			//맨 처음에 add를 하는 코드
			//head =newnode;
			//newnode.next = next;
			//중간에 add를 하는 코드
			//LastReturned.next = newnode;
			//newnode.next = next;
			//위 두 코드를 합치는 코드
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
				throw new IllegalStateException();  //에러라고 뜨게하는 코드
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


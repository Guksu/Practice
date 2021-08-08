package arraylist;

public class Arraylist {
	private int size = 0; //��� �����Ͱ� ����Ʈ�� ����ִ��� ���� �� 0���� �����Ѵٴ� ��
	private Object[] elementData = new Object[100] ; //����Ʈ�� ������ �� �ִ밪
	
	//�� ó����element�� �߰��ϴ� �ڵ�
	public boolean addFirst(Object element) {
		return add(0,element);
	}
	
	public boolean addLast(Object element) {
		elementData [size] = element ;
		size++;
		return true;
	}
	//�����ִ� element�� ���������� �� ĭ �� �̵��ϴ� �ڵ�
	public boolean add(int index, Object element) {
		for (int i = size-1; i>=index; i--) {
			elementData[i+1]=elementData[i];
		}
		elementData[index] = element;
		size ++; //�� ����Ʈ ������ ������Ű�°�
		return true;
	}
	
	//element�� �������� �� ĭ �� �̵��ϴ� �ڵ�
	public Object remove(int index) {
		Object removed = elementData[index]; //�����Ǵ� elemntData�� ���߿� ����ϱ� �����ڵ�
		for (int i = index+1; i<=size-1; i++) {
			elementData[i-1]=elementData[i];
		}
		size --; //�� ����Ʈ ������ ���ҽ�Ű�°�
		elementData[size] = null;
		return removed;//�����Ǵ� elemntData�� ���߿� ����ϱ� �����ڵ�
	}
	//println�� ��ü�� ����ϴ� �ڵ�
	public String toString() {
		String str = "[";
		for (int i=0; i<size; i++) {
			str+= elementData[i];
			if( i < size-1) {
				str+= ",";
			}
		}				
		return (str +"]");		
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	//element�� Index�� �˷��ִ� �ڵ�
	public int locateindex(Object f) {
		for (int i = 0; i<size; i++ ) {
			if(f.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}		
	//element�� ������� ����ϴ� �ڵ�
	//class�� ���� ����� ���� :listIterator�� �ϴ� ������ hasNext Next ���� �޼ҵ�θ� �����ص� ��ɻ� ������ ������. class�� ���� ���� �� ���� ��ɸ� �����ϵ��� �и��Ͽ� ��ü��������� Encapsulation�� �����ϴ� ������ �ֽ��ϴ�.
    //�׸��� ���������� ���� �ٷ�� ���ؼ� Interface�� ������� �ʾ����� Iterator ���� Interface�� �����ϴ� Ŭ������ ���� ���� Encapsulation�� �����ϵ��� ����˴ϴ�.
	public ListIterator listIterator(){
		return new ListIterator();
	}
	
	class ListIterator{
		private int nextIndex = 0;
		
		public boolean hasNext() {
			return nextIndex < size;
		}
		public Object next() {
//			Object returndata= elementData[nextIndex];
//			nextIndex ++;
//			return returndata;
			return elementData[nextIndex ++];
		}
	}
}
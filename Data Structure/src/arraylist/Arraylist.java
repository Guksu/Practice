package arraylist;

public class Arraylist {
	private int size = 0; //몇개의 데이터가 리스트에 들어있는지 뜻함 즉 0부터 시작한다는 뜻
	private Object[] elementData = new Object[100] ; //리스트가 수용할 수 최대값
	
	//맨 처음에element를 추가하는 코드
	public boolean addFirst(Object element) {
		return add(0,element);
	}
	
	public boolean addLast(Object element) {
		elementData [size] = element ;
		size++;
		return true;
	}
	//끝에있는 element를 오른쪽으로 한 칸 씩 이동하는 코드
	public boolean add(int index, Object element) {
		for (int i = size-1; i>=index; i--) {
			elementData[i+1]=elementData[i];
		}
		elementData[index] = element;
		size ++; //총 데이트 수량을 증가시키는것
		return true;
	}
	
	//element를 왼쪽으로 한 칸 씩 이동하는 코드
	public Object remove(int index) {
		Object removed = elementData[index]; //삭제되는 elemntData를 나중에 출력하기 위한코드
		for (int i = index+1; i<=size-1; i++) {
			elementData[i-1]=elementData[i];
		}
		size --; //총 데이트 수량을 감소시키는것
		elementData[size] = null;
		return removed;//삭제되는 elemntData를 나중에 출력하기 위한코드
	}
	//println의 객체를 출력하는 코드
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
	//element의 Index를 알려주는 코드
	public int locateindex(Object f) {
		for (int i = 0; i<size; i++ ) {
			if(f.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}		
	//element를 순서대로 출력하는 코드
	//class를 따로 만드는 이유 :listIterator가 하는 역할인 hasNext Next 등을 메소드로만 구성해도 기능상에 문제는 없지만. class로 따로 만들어서 그 관련 기능만 수행하도록 분리하여 객체지향원리중 Encapsulation을 실현하는 목적도 있습니다.
    //그리고 예제에서는 쉽게 다루기 위해서 Interface를 사용하지 않았지만 Iterator 관련 Interface를 구현하는 클래스를 따로 만들어서 Encapsulation을 실현하도록 권장됩니다.
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
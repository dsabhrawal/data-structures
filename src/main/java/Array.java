
public class Array {

	private int[] items;
	private int count;
	public Array(int size) {
		items = new int[size];
	}

	public int getCount() {
		return count;
	}
	public int insert(int element) {
		if(count == items.length) {
			int []newItems = new int[count*2];
			for(int i=0;i <count;i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
		items[count++] = element;
		return indexOf(element);
	}

	public void remove(int element) {
		int index = indexOf(element);
		if(index == -1) {
			return ;
		}
		for(int i=index; i < count;i++) {
			items[i]= items[i+1];
		}
		count--;
	}
	
	private int indexOf(int element) {
		for(int i=0;i<count;i++) {
			if(items[i] == element) {
				return i;
			}
		}
		return -1;
	}

	private void print() {
		System.out.print("[");
		for(int i=0; i<count;) {
			System.out.print(items[i]);
			i++;
			if(i != count) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String args[]) {
		Array items = new Array(3);
		items.insert(10);
		items.insert(20);
		items.insert(20);
		items.insert(40);
		items.insert(30);
		
		items.remove(20);
		items.print();
		System.out.println(items.indexOf(20));
	}

}
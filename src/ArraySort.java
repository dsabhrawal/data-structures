
public class ArraySort {

	public static void main(String[] args) {

		int a[] = {1,5,8,7};
		int b[] = new int[a.length];
		for(int i=0;i < a.length ; i++) {
			for(int j=i+1;j < a.length ; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					b[i] = a[i];
				}
			}
			b[i] = a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}

package array;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,-2,-4,-3,-93};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		for(int item: a) {
			System.out.print(item+"  ");
		}

	}

}

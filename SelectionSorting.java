package array;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] a= {-3,4,2,7,8,9};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			int minInd=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
		for(int e: a) {
			System.out.print(e+" ");
		}

	}

}

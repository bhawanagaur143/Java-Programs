package array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {5,4,3,6,2,7,9,8,1};
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			
			for(int j=0;j<n-1;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
					sorted=false;
				}
			}
			if(sorted==true) break;
		}
		for(int item: a) {
			System.out.print(item+" ");
		}

	}

}

class LowArray{
	private long[] a;
	public LowArray(int size) {
		a=new long[size];
	}
	public void setEle(int indax,long value) {
		a[indax]=value;
	}
	public long getEle(int indax) {
		return a[indax];
	}
}
class LowArrayApp {

	public static void main(String[] args) {
		LowArray arr;
		arr=new LowArray(100);
		int nEles=0;
		arr.setEle(0, 77);
		arr.setEle(1, 99);
		arr.setEle(2, 44);
		arr.setEle(3, 55);
		arr.setEle(4, 22);
		arr.setEle(5, 88);
		arr.setEle(6, 11);
		arr.setEle(7, 00);
		arr.setEle(8, 66);
		arr.setEle(9, 33);
		nEles=10;
		int j;
		
		for(j=0;j<nEles;j++) {
			System.out.print(arr.getEle(j)+" ");
			System.out.println("");
		}
		int searchKey=26;
		for(j=0;j<nEles;j++) {
			if(arr.getEle(j)==searchKey)
				break;
			if(j==searchKey)
				System.out.println("Can't find "+searchKey);
			else
				System.out.println("Found "+searchKey);
		}
		for(j=0;j<nEles;j++) {
			if(arr.getEle(j)==55)
				break;
			for(int k=j;k<nEles;k++) {
				arr.setEle(k, arr.getEle(k+1));
				nEles--;
			}
		}
		for(j=0;j<nEles;j++) {
			System.out.print(arr.getEle(j)+" ");
			System.out.print(" ");
		}

	}

}

		



package classesandobjects;

public class DynamicArray {
	private int[] data;
	private int nextElementIndax;
	
	public DynamicArray() {
		data=new int[5];
		nextElementIndax=0;
	}
	
	public int size() {
		return nextElementIndax;
	}
	
	public boolean isEmpty() {
		return nextElementIndax==0;
	}
	
	public int get(int i) {
		if(i>=nextElementIndax) {
			//throw error
			return -1;
		}
		return data[i];
	}
	
	public void add(int elem) {
		if(nextElementIndax==data.length) {
			doubleCapacity();
		}
		data[nextElementIndax]=elem;
		nextElementIndax++;
	}
	
	

	private void doubleCapacity() {
		
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}

	public void set(int i,int elem) {
		if(i>=nextElementIndax) {
			//throw error
			return;
		}
		data[i]=elem;
	}
	
	public int removeLast() {
		if(nextElementIndax==0) {
			return -1;
		}
		int temp=data[nextElementIndax-1];
		data[nextElementIndax-1]=0;
		nextElementIndax--;
		return temp;
	}
}

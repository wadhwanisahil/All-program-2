package Arrays;

public class Array {
	 private int []items;
	 private int count;

	public Array(int length) {
		// TODO Auto-generated constructor stub
		items=new int[length];
	}
	public void insert(int item) {
		//items[count++]=item;
		if(items.length==count) {
			int[] newitem=new int[count*2];
			for(int i=0;i<=count;i++) 
				newitem[i]=items[i];
			
			items=newitem;
		}
		
		
		
		items[count++]=item;
		
	}
public void print() {
	for(int i=0;i<=count;i++) {
		System.out.println(items[i]);
	}
}
public void removeAt(int index) {
if(index<0||index>=count) 
	throw new IllegalArgumentException();
for(int j=0;j<=count;j++) 
	items[j]=items[j+1];
	
count--;
}
public int indexof(int item) {
	for(int i=0;i<=count;i++)
		if (items[i]==item) 
			return i;
		
	return -1;
}
}

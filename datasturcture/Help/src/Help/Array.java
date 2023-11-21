package Help;

public class Array {
private int [] items;
int count;
	Array(int length){
		items=new int [length];
		
	}
	public void insert(int item) {
		if(items.length==count) {
			int[] newitem=new int[count*2];
			 for(int i=0;i<count;i++) {
				 newitem[i]=items[i];
				 items=newitem;
			 }
			
		}
		items[count++]=item;
		//count++;
		  
	}
	public void removeat(int index) {
		if(index<0||index>=count) 
			throw new IllegalArgumentException();
			for(int i=index;i<count;i++) {
				items[i]=items[i+1];
				count--;
				
			
		}
	}
	public int indexof(int item) {
		for(int i=0;i<count;i++) 
			if(items[i]==item)
				return i;
		return -1;
	}
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println(items[i] );
		}
	}
}

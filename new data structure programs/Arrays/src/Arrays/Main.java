package Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array number=new Array(6);
number.insert(55);
number.insert(11);
number.insert(12);
number.insert(13);
number.removeAt(2);
System.out.println(number.indexof(12));

//number.print();
	}

}

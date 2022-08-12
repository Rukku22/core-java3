package project4;

public class Exception1 {

	public static void main(String[] args) {
	try {
		int arr[]= {3,5,6};
		System.out.println(arr[10]);
		}
	catch(ArrayIndexOutOfBoundsException e) {  
System.out.println(e);
	}
	System.out.println("remaing print");
	
	}

	}



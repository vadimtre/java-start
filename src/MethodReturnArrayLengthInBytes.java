import java.util.Arrays;

public class MethodReturnArrayLengthInBytes {
/*Task-5-3 #15
 * Написать метод, который принимает в качестве аргумента массив целых чисел типа int и возвращает его длину в байтах.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[] {5,6,7,8,9};
		int len = returnArrayLengthInBytes(arr);
		System.out.println("Length of array " + Arrays.toString(arr) + " equals " + len );
	}
	
	static int returnArrayLengthInBytes(int arr[]) {
		int len = arr.length;
		return len;	
	}

}

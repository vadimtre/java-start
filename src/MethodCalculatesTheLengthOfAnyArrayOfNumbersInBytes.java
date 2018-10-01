import java.util.Arrays;

/*Task-5-4 #16
 * Написать программу, которая умеет рассчитать длину массива любых типов чисел в байтах.*/
public class MethodCalculatesTheLengthOfAnyArrayOfNumbersInBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = {1, 6.2};
		calculatesTheLengthOfAnyArrayOfNumbersInBytes(arr);
	}

	static void calculatesTheLengthOfAnyArrayOfNumbersInBytes(double [] arr ) {
		int len = arr.length;
		System.out.println("LEngth of the array " + Arrays.toString(arr) + " equals " +  len);
	}

}

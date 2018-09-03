

import java.util.Arrays;

/*Task-3-2 #5
 *  меняет местами первый и последний элементы массива произвольной длины
    выводит массив на экран
*/
public class ArrayReplaceFirstWithLast {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,4,5,6,6,7,3,0,56 };
		//Arrays.sort(arr);
		int f = arr[0];
		int l = arr[arr.length-1];
		arr[0]= l;
		arr[arr.length-1]= f;
		System.out.println(Arrays.toString(arr));
	}
}

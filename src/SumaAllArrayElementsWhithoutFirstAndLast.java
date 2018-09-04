
public class SumaAllArrayElementsWhithoutFirstAndLast {
/*Task-4-4 #11
 * Написать программу, которая выведет на экран сумму элементов массива кроме первого и последнего*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-5000, -1, 67, 342, 2056},i =1, sum =0;
		
		while (i<arr.length-1) {
			sum+= arr[i++];
		}
		
		System.out.println(sum);
	}

}

package lesson3_hw;

import java.util.Arrays;
import java.util.Scanner;

/*Task-3-3 #6
    читает с консоли массив целых чисел из 4 элементов
    разбивает его на два массива равной длины
    выводит результат на экран
*/
public class ReadFromConsole4Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter four numbers :");
		Scanner sc=new Scanner(System.in);
		
		int[] ar = new int[4];
		int[] ar1 = new int[2]; int[] ar2 = new int[2];
		
		System.out.println("Enter first number .");
		ar[0] = sc.nextInt();
		System.out.println("Enter second number .");
		ar[1] = sc.nextInt();
		System.out.println("Enter third number .");
		ar[2] = sc.nextInt();
		System.out.println("Enter fouth number .");
		ar[3] = sc.nextInt();
		
		System.arraycopy(ar, 0, ar1, 0, 2);
		System.arraycopy(ar, 2, ar2, 0, 2);
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
	}

}

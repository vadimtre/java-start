package lesson2_hw;

import java.io.IOException;
import java.util.Scanner;

/*Task-2-2 #3
 * Написать программу, которая читает с консоли два целых числа, потом выводит в консоль результат:

    сложения чисел
    вычитания первого числа из второго
    деления второго числа на первое
    умножения второго числа на второе
    остаток от деления суммы первого числа и второго на первое число

Добавить программу в репозиторий GitHub в папку /src*/
public class ReadFromConcoleTwoNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers :");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number .");
		int f = sc.nextInt();
		System.out.println("Enter second number .");
		int s = sc.nextInt();
		
		System.out.println("Addition of numbers: " + (f+s));
		System.out.println("Subtraction of the first number from the second: " + (s-f));
		System.out.println("Dividing the second number by the first: " + (s/f));
		System.out.println("Multiplyng the second number by the second: " + (f*s));
		System.out.println("The remainder of dividing the sum of the first and second by the first number: " + (f+s)%f);
	}

}

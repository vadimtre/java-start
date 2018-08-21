package lesson2_hw;

import java.util.*;
/*Task-2-1 #2
 * Написать программу, которая читает с консоли три строки, потом выводит в консоль результат конкатенации:

    первая строка с третьей
    третья строка со второй и с первой
    первая строка со второй и с третьей

Добавить программу в репозиторий GitHub в папку /src*/
public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three strings .");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first string .");
		String f = sc.nextLine();
		System.out.println("Enter second string .");
		String s = sc.nextLine();
		System.out.println("Enter third string .");
		String t = sc.nextLine();
		
		System.out.println("First string with third .");
		System.out.println(f+t);
		System.out.println("Third string with second and first .");
		System.out.println(t+s+f);
		System.out.println("First string with second and third .");
		System.out.println(f+s+t);
	}

}

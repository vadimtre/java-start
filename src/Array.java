

import java.util.Arrays;

/*Task-3-1 #4
 * Написать программу, которая:

    создает массив из 10 целых чисел
    сортирует элементы массива по возрастанию
    выводит отсортированный массив на экран

Добавить программу в репозиторий GitHub в папку /src*/
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte arr[] = {5,3,4,5,6,6,7,3,0,56 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

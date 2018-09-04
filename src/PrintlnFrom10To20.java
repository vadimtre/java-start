
public class PrintlnFrom10To20 {
/*Task-4-1 #8
 * Написать программу, которая выведет на экран числа от 10 до 20 с помощью:

    цикла while
    цикла do while
    цикла for
    цикла foreach
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		System.out.println("while");
		while ( i <= 20) {
			System.out.println(i++);
		}
		i=10;
		System.out.println("do while");
		do {
			System.out.println(i++);
		} while (i<=20);
		System.out.println("for");
		for (int j = 10; j < 21; j++) {
			System.out.println(j);
		}
		System.out.println("foreach");
		int [] arr = {10,11,12,13,14,15,16,17,18,19,20};
		for (int ii : arr) {
			System.out.println(ii);
		}
	}
}

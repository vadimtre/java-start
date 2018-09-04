
public class PrintlnFrom1To100DivideWithoutRemainder {
/*Task-4-2 #9
 * Написать программу, которая выведет на экран все числа от 1 до 100, которые делятся на 3 без остатка*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<101) {
			if(i%3==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}

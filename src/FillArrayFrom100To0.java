
public class FillArrayFrom100To0 {
/*Task-4-3 #10
Написать программу, которая заполнит массив числами от 100 до 0*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=100;
		//int[] arr;
		int [] arr = new int[101];
		for(int i=100, j=0; i>=0; i--,j++) {
			arr[j]=i;	
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}

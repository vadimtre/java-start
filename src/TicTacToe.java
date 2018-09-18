import java.util.Scanner;
import java.lang.Math;

public class TicTacToe {

	//declare of variables
	static Scanner sc=new Scanner(System.in);
	static char symbolOfUser,	symbolOfcomputer;
	static char arr_keeps_moves[]= {0,1,2,3,4,5,6,7,8,9};
	static String  arrGameField[][]= { {"   |   |   "},
			{" ","1"," ","| ", "2"," |"," ","3"," "},
			{"___|___|___"},
			{"   |   |   "},
			{" ","4"," ","| ", "5"," |"," ","6"," "},
			{"___|___|___"},
			{"   |   |   "},
			{" ","7"," ","| ", "8"," |"," ","9"," "},
			{"   |   |   "}
	};

	private static void choiceOfSymbol() {
		// TODO Auto-generated method stub
		System.out.println("The choice of the Symbol that you will play:  ");
		System.out.println("   		enter 1 if you want to play by X (a cross) ;");
		System.out.println("   		or enter 2 if you want to play by O (a zero) .");

		do {
			int choice = sc.nextInt();
			if(choice!=1 && choice!=2) { 
				System.out.println("Make the correct choice, enter the number 1 or 2 !!! ");
			} else {
				System.out.println("----------------------------------");
				System.out.print("--> ");
				if(choice==1) {
					symbolOfUser='X'; symbolOfcomputer='O';
					System.out.println("You will play by 'X'(a cross)  ");
				}else {
					symbolOfUser='O'; symbolOfcomputer='X';
					System.out.println("You will play by 'O'(a zero)  ");
				}
				System.out.println("----------------------------------");
				return;
			}
		} while (true);
	}
	
	//Output array on the screen
	static void outputArray(){
		for (int i = 0; i < arrGameField.length; i++) {
			for (int j = 0; j < arrGameField[i].length; j++) {
				if (arrGameField[i].length>1) {
					System.out.print(arrGameField[i][j]);
					if (j == arrGameField[i].length-1) System.out.print("\r");
				} else {
					System.out.println(arrGameField[i][j]);
				}
			}
		}
	}
	
	static void outputArray(char ch){
		outputArray();
		System.out.println("Enter number from 1 to 9 where you want to go ."); 
	}

	static void changeSymbol(int numberPlaceOfChange, char symbolOfChange){
		for (byte i = 0; i < arrGameField.length; i++) {
			for (byte j = 0; j < arrGameField[i].length; j++) {
				if (arrGameField[i][j].matches("\\d") && Integer.valueOf(arrGameField[i][j])==numberPlaceOfChange ) {	//parseInt
					arrGameField[i][j] = Character.toString(symbolOfChange);
					return;
				}
			}
		}
	}
	
	static boolean weHaveA_Winner  () {
		boolean isTheWinner =false;
		if(arr_keeps_moves[1]==arr_keeps_moves[2] && arr_keeps_moves[2]==arr_keeps_moves[3]) {
			isTheWinner =true;
		}else if(arr_keeps_moves[1]==arr_keeps_moves[4] && arr_keeps_moves[4]==arr_keeps_moves[7]) {
			isTheWinner = true;
		}else if(arr_keeps_moves[1]==arr_keeps_moves[5] && arr_keeps_moves[5]==arr_keeps_moves[9]) {
			isTheWinner = true;
		}else if(arr_keeps_moves[2]==arr_keeps_moves[5] && arr_keeps_moves[5]==arr_keeps_moves[8]) {
			isTheWinner = true;
		}else if(arr_keeps_moves[3]==arr_keeps_moves[5] && arr_keeps_moves[5]==arr_keeps_moves[7]) {
			isTheWinner = true;
		}else if(arr_keeps_moves[3]==arr_keeps_moves[6] && arr_keeps_moves[6]==arr_keeps_moves[9]) {
			isTheWinner = true;
		}else if(arr_keeps_moves[4]==arr_keeps_moves[5] && arr_keeps_moves[5]==arr_keeps_moves[6]) {
			isTheWinner = true;
		}else if(arr_keeps_moves[7]==arr_keeps_moves[8] && arr_keeps_moves[8]==arr_keeps_moves[9]) {
			isTheWinner = true;
		}
		return 				isTheWinner;
	}
	
	private static boolean checkForFreeRuns() {
		// TODO Auto-generated method stub
		for (int all=1; all< arr_keeps_moves.length; all++) {
			if (arr_keeps_moves[all]==symbolOfUser || arr_keeps_moves[all]==symbolOfcomputer) {
				continue;
			}else {
				return true;
			}
		}
		return false;
	}
	
	private static void reactionOnAbsenceOfFreeMoves() {
		// TODO Auto-generated method stub
		System.out.println("Game over !!! ");
	}
	
	static void userGo() {
		if(!checkForFreeRuns()) {
			reactionOnAbsenceOfFreeMoves();
		}else {
			outputArray(' '); 
		}
		
		int choice = sc.nextInt();	//System.out.println("You entered number "+choice);
		if(choice<1 || choice>9) {
			System.out.println("Wrong number ! Enter a number at range from 1 to 9 .");
		} else {
			if (arr_keeps_moves[choice] != symbolOfUser && arr_keeps_moves[choice] != symbolOfcomputer) {
				changeSymbol(choice, symbolOfUser);
				outputArray();
				arr_keeps_moves[choice] = symbolOfUser;
			}else {
				System.out.println("Incorrect number ! This number has already been selected . Choose another move !!");	
			}
		}	
	}

	static boolean computerGo() {
		if(!checkForFreeRuns()) reactionOnAbsenceOfFreeMoves();
		do {		
			int random_number = (int)(Math.random()*10); //ret double
			System.out.println(random_number);
			if (random_number==0) continue;
			if (arr_keeps_moves[random_number]==symbolOfUser || arr_keeps_moves[random_number]==symbolOfcomputer) {
				/*for (int all=1; all< arr_keeps_moves.length; all++) {
					if (arr_keeps_moves[all]==symbolOfUser || arr_keeps_moves[all]==symbolOfcomputer) {
						continue;
					}else {
						changeSymbol(all, symbolOfcomputer);
						arr_keeps_moves[all] = symbolOfcomputer;
						outputArray();
						return true;
					}
				}*/
				continue;
			} else {
				changeSymbol(random_number, symbolOfcomputer);
				arr_keeps_moves[random_number] = symbolOfcomputer;
				outputArray();
				return true;	//found_digital=true;
			}
		//	return false;
		} while (true);//(found_digital==false);
	}

	public static void main(String[] args) {

		choiceOfSymbol();

		do {	
			/*System.out.println("Enter number from 1 to 9 where you want to go . ");
			outputArray();*/
			
			if (symbolOfUser=='X') {
				userGo();
				computerGo();
			} else {
				computerGo();
				userGo();
			}
		
			//COMPUTER GO
			if(!computerGo()) {
				break;
			}
		} while (true);		

		System.out.println("Game over!!!!!!");
	}

}

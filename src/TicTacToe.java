import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class TicTacToe {

	//declare of variables
	static boolean gameWithA_Computer = false ;	//moveX = true
	static Scanner sc=new Scanner(System.in);
	static char symbolOfPlayer_1,	symbolOfPlayer_2;
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
	static String yourName = "", nameAnOpponent ="", isGoing = "Player1" ;
	static String header = "-----------------------------------------------------------";

	static void choiceAnOpponent() throws IOException{
		System.out.println(header);
		System.out.println("Сhoice an opponent whith whom you will play:  ");
		System.out.println("   		enter 1 if you want to play with a person ;");
		System.out.println("   	or  enter 2 if you want to play with the computer ;");
		System.out.println(header);
		do {
			int choice = sc.nextInt();
			if(choice!=1 && choice!=2) { 
				System.out.println("Make the correct choice, enter the number 1 or 2 !!! ");
			} else {
				if(choice==1) {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("Enter your name:  ");
					yourName =br.readLine(); //sc.nextLine();
					System.out.println("Good luck "+yourName+", I wish you victory !");//return;
					choiceOfSymbol();
					System.out.print("Enter the name of the opponent :  ");
					nameAnOpponent =br.readLine();
					System.out.println("Good luck "+nameAnOpponent+", I wish you victory too !");
					System.out.println("------------------------------------------------------");
					System.out.println("");
				}else {
					choiceOfSymbol();
					gameWithA_Computer = true;
				}
			}
			return;
		}while(true);
	}

	private static void choiceOfSymbol() {
		// TODO Auto-generated method stub
		System.out.println("The choice of the Symbol that you will play:  ");
		System.out.println("   		enter 1 if you want to play by X (a cross) ;");
		System.out.println("   	or  enter 2 if you want to play by O (a zero) .");

		do {
			int choice = sc.nextInt();
			if(choice!=1 && choice!=2) { 
				System.out.println("Make the correct choice, enter the number 1 or 2 !!! ");
			} else {
				System.out.println("----------------------------------");
				System.out.print("--> ");
				if(choice==1) {
					symbolOfPlayer_1='X'; symbolOfPlayer_2='O'; 
					System.out.println("You will play by 'X'(a cross)  ");
				}else {
					symbolOfPlayer_1='O'; symbolOfPlayer_2='X';isGoing="Player2";
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
		String player="", beginSentence;
		//String message = "%s + %snter number from 1 to 9 where you want to go .";
		if (!gameWithA_Computer) {
			player=(isGoing == "Player1")?yourName:nameAnOpponent;		 beginSentence=", e" ;
		}else {
			beginSentence="E";
		}
		//System.out.println(String.format(message, player, beginSentence)); 
		System.out.printf("%s%snter number from 1 to 9 where you want to go .", player, beginSentence);
		System.out.println();
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
		char crossedOutSymbolO ='Ɵ';

		if(arr_keeps_moves[1]==arr_keeps_moves[2] && arr_keeps_moves[2]==arr_keeps_moves[3]) {
			isTheWinner =true;
			crossedOutWinLine(1, 2, 3); 
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

	static void crossedOutWinLine(int first, int second, int third) {

	}

	private static boolean checkForFreeRuns() {
		// TODO Auto-generated method stub
		for (int all=1; all< arr_keeps_moves.length; all++) {
			if (arr_keeps_moves[all]==symbolOfPlayer_1 || arr_keeps_moves[all]==symbolOfPlayer_2) {
				continue;
			}else {
				return true;
			}
		}
		return false;
	}

	private static void reactionOnAbsenceOfFreeMoves() {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Game over! There are no more moves ! There are no more moves !! There are no more moves !!!");	//Game over !!!
		System.out.println("---------------------------------------------------------------------------------------------");
		outputArray();
	}

	static boolean userGo() {
		if(!checkForFreeRuns()) {
			reactionOnAbsenceOfFreeMoves();
			return false;
		}else {

			do {
				int choice = sc.nextInt();	//System.out.println("You entered number "+choice);
				if(choice<1 || choice>9) {
					System.out.println("Wrong number ! Enter a number at range from 1 to 9 .");
					continue;
				} else {
					if (arr_keeps_moves[choice] != symbolOfPlayer_1 && arr_keeps_moves[choice] != symbolOfPlayer_2) {
						if (!gameWithA_Computer) {
							if (isGoing == "Player1") {
								changeSymbol(choice, symbolOfPlayer_1);
								arr_keeps_moves[choice] = symbolOfPlayer_1;
							}else {
								changeSymbol(choice, symbolOfPlayer_2);
								arr_keeps_moves[choice] = symbolOfPlayer_2;
							}	
						}else {
							changeSymbol(choice, symbolOfPlayer_1);
							arr_keeps_moves[choice] = symbolOfPlayer_1;
						}
						if (weHaveA_Winner()) {	
							String winner = "";
							if (!gameWithA_Computer) { winner=(isGoing == "Player1")?yourName:nameAnOpponent;}
							System.out.println("Game over! Congratulate," + winner + " you won ! YOU WON ! YOU WON !! YOU WON !!!  YOU WON !!!!");
							outputArray();
							return false;
						}else{
							if(isGoing == "Player1") {
								isGoing = "Player2";	
							}else {
								isGoing = "Player1";
							}
							return true;
						}
					}else {
						System.out.println("Incorrect number ! This number has already been selected . Choose another move !!");	
					}
				}	
			}while(true);
		}
	}

	static boolean computerGo() {
		if(!checkForFreeRuns()) {
			reactionOnAbsenceOfFreeMoves();
			return false;
		}else {
			do {		
				int random_number = (int)(Math.random()*10); //ret double
				//System.out.println(random_number);
				if (random_number==0) continue;
				if (arr_keeps_moves[random_number]==symbolOfPlayer_1 || arr_keeps_moves[random_number]==symbolOfPlayer_2) {
					continue;
				} else {
					changeSymbol(random_number, symbolOfPlayer_2);
					arr_keeps_moves[random_number] = symbolOfPlayer_2;
					if (weHaveA_Winner()) {
						System.out.println("Game over! Blame you have lost !");
						outputArray();
						return false;
					}else{
						return true;
					}
				}		
			} while (true);//(found_digital==false);
		}
	}

	public static void main(String[] args) throws IOException {

		choiceAnOpponent();
		//choiceOfSymbol();

		do {	
			if (gameWithA_Computer) {
				if (symbolOfPlayer_1=='X') {
					outputArray(' ');
					if(!userGo()) break;
					if(!computerGo()) break;
				} else {
					if(!computerGo()) break;
					outputArray(' ');
					if(!userGo()) break;
				}
			} else {
				outputArray(' ');
				if(!userGo()) break;
			}

		} while (true);		

		System.out.println("Game over!!!!!! Game over!!!!!! Game over!!!!!!");
	}

}

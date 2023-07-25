import java.util.Scanner;

public class uiui {

	
	public static void main(String[]args){
		Scanner deepak = new Scanner(System.in);
		System.out.println("Enter the Question:");
		String question =deepak.nextLine();

		switch (question) {
			case "what is the color of the carrot":{
				System.out.println("Orange");
				break;
			}
				
				
		
			default:
				System.out.println("question ah olunga kelu");
				break;
		}
		deepak.close();
	}
}
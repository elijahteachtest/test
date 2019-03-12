import java.util.Scanner;
import java.text.DecimalFormat;

public class MathTutor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Main menu");
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Exit");
		int userChoice = 0;
		System.out.println("Enter a choice:");
		userChoice = input.nextInt();
	 
		while (userChoice != 5) {
			int firstNum = (int)(Math.random() * 10);
			int secondNum = (int)(Math.random() * 10);

			switch (userChoice) {
			case 1: 
				int adding = firstNum + secondNum;
				System.out.println(firstNum +" + "+secondNum+"?"); 
				int addingInput = input.nextInt();
				if (addingInput == adding)
					System.out.println("correct");
				else 
					System.out.println("Your answer is wrong. The correct answer is "+ adding);
				break;

			case 2:
				int sub = firstNum - secondNum;
				System.out.println(firstNum +" - "+secondNum+"?"); 
				int subInput = input.nextInt();
				if (subInput == sub)
					System.out.println("correct");
				else 
					System.out.println("Your answer is wrong. The correct answer is "+ sub);
				break;

			case 3:
				int mult = firstNum * secondNum;
				System.out.println(firstNum +" * "+secondNum+"?"); 
				int multInput = input.nextInt();
				if (multInput == mult)
					System.out.println("correct");
				else 
					System.out.println("Your answer is wrong. The correct answer is "+ mult);
				break;

			case 4:
				while (secondNum == 0){
					// to make sure the bottom number is never zero
					secondNum = (int)Math.round((Math.random()*10));
				};
				double div = firstNum / secondNum;
				System.out.println(firstNum +" / "+secondNum+"?"); 
				double divInput = input.nextDouble();

				if (divInput == div)
					System.out.println("correct");
				else 
					System.out.println("Your answer is wrong. The correct answer is "+ div);
				break;

			case 5:
				System.exit(0); break;

			default: 
				System.out.println("Error: Out of range");
				System.exit(0);
			}
			System.out.println("Enter a choice:");
			userChoice = input.nextInt();
		}
		System.out.println("Thank you for using the Math Tutor Program. Have a Great Day!");
	}
}
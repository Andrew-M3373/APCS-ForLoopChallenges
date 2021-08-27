import java.util.Scanner;
public class ForLoopChallenges {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("I love donuts!");
		}
		for (int i =1; i <=5; i++) {
			System.out.println(i);
		}
		for (int i =5; i >=1; i--) {
			System.out.println(i);
		}
		for (int i = 5; i <=100; i+=5) {
			System.out.println(i);
		}
		int add = 0;
		for (int i = 5; i <= 100; i+=5) {
			add +=i;
		}
		System.out.println(add);
		
		System.out.println("Give a lower bound.");
		Scanner userInput = new Scanner(System.in);
		int lowerBound = userInput.nextInt();
		System.out.println("Give an upper bound.");
		int upperBound = userInput.nextInt();
		int sum = 0;
		for (int i = lowerBound; i <= upperBound; i ++) {
			sum += i;
		}
		System.out.println(sum);

		
		System.out.println("*********");
		for (int i = 0; i <= 8; i ++) {
			System.out.println("*       *");
		}
		System.out.println("*********");
		
		for (int i = 9+1; i <=51-1; i+=9+1) {
			System.out.println(i);
		}
	}

}

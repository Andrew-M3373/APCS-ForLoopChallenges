import java.util.Scanner;
public class ForLoopChallenges {

	public static void main(String[] args) {
		
		donuts();
		forward();
		backward();
		tenTo100();
		add();
		addInput();
		nineByNine();
		tenToFifty();
		
		// Practice escape characters.
		System.out.println("\"dog\"");
		System.out.println("\\\\");
	}
	
	public static void donuts() {
		for (int i = 0; i <= 4; i++) {
			System.out.println("I love donuts!");
		}
	}
	public static void forward() {
		for (int i =1; i <=5; i++) {
			System.out.println(i);
		}
	}
	public static void backward() {
		for (int i =5; i >=1; i--) {
			System.out.println(i);
		}
	}
	public static void tenTo100() {
		for (int i = 5; i <=100; i+=5) {
			System.out.println(i);
		}
	}
	public static void add() {
		int add = 0;
		for (int i = 5; i <= 100; i+=5) {
			add +=i;
		}
		System.out.println(add);
	}
	public static void addInput() {
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
	}
	public static void nineByNine() {
		System.out.println("*********");
		for (int i = 0; i <= 8; i ++) {
			System.out.println("*       *");
		}
		System.out.println("*********");
	}
	public static void tenToFifty() {
		for (int i = 9+1; i <=51-1; i+=9+1) {
			System.out.println(i);
		}
	}

}

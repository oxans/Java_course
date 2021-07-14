public class HomeWorkApp{
	
	public static void main(String[] args) {
		System.out.println("Task 2: ");
		printThreeWords();
		System.out.print("Task 3: ");
		checkSumSign();
		System.out.print("Task 4: ");
		printColor();
		System.out.print("Task 5: ");
		compareNumbers();
	}
	public static void printThreeWords() {
		System.out.println("_Orange");
		System.out.println("_ Banana");
		System.out.println("_ Apple");
	}
	public static void checkSumSign(){
		int a = -10;
		int b = 5;
		if ((a = a + b) >= 0) System.out.println("The amount is positive"); else System.out.println("The amount is negative");
	}
	public static void  printColor() {
		int valueT3 = 180;
		if (valueT3 <= 0) {
			System.out.println("Red");
		} if (valueT3 > 0 && valueT3 <= 100){
			System.out.println("Yellow");
		}else{
			System.out.println("Green");
		}
	}
	public static void compareNumbers() {
		int a5 = 78;
		int b5 = 1;
		String result = (a5 >= b5) ? "a >= b" : "a<b";
		System.out.println(result);
	}
}
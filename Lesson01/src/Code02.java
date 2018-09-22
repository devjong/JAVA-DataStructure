import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		
		int number = 123;
		// 키보드로 부터 입력 받기   System.in은 표준 입력을 의미 즉 키보드를 입력한다. 
		Scanner kb = new Scanner(System.in); // 스캐너를 만든다.
		
		System.out.print("Please enter an integer: ");
		
		int input = kb.nextInt(); // 키보드로 부터 정수 하나를 입력받는다.(키보드에서 값을 읽어들인다.)
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		
		kb.close(); //스캐너가 필요없어지는 시점에 스캐너를 닫아줘야 한다.
	}

}

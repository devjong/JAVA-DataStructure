import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		
		int number = 123;
		// System.in은 표준 입력을 의미 즉 키보드를 입력한다. 
		// 키보드에서 타입핑하느 것을 입력받을 수 있음 준비상태 즉, 초기화
		Scanner kb = new Scanner(System.in); // 
		
		System.out.print("Please enter an integer: ");
		
		// 키보드로 부터 정수 하나를 입력.(키보드에서 값을 읽어들인다.)
		int input = kb.nextInt();  // == scanf("%d", &input);
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		
		kb.close(); //스캐너가 필요없어지는 시점에 스캐너를 닫아줘야 한다.
	}

}

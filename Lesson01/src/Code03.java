import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		String str = "Hello, world";
		String input = null;
		
		Scanner keyboard = new Scanner(System.in); // System.in 키보드 입력을 의미합
		System.out.println("Please type a String: ");
		input = keyboard.nextLine();
		
		//두개의 문자열이 동일한지 판단하려면 equals()로 검사함
		if(str.equals(input)) {  // input.equals(str)
			System.out.println("Strings match! :-)");
		} else {
			System.out.println("Strings do not match :-(");
		}
		
		// keyboard.next() 한 문자만 저장이된 만약 Hello, world라면 Hello만 읽어들인다.
		// keyboard.nextLine() 물자열이 저장이 된다. 만약 Hello, world를 입력했다면 Hello, world를 읽어들인다.
		// 프리미타입아닌 것의 두 데이터의 동일성을 판단은 == 로 하지 못한다. equals()로 판달 할 수 있다.
		
		keyboard.close();
		
	}

}

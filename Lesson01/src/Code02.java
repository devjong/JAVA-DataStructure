import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		
		int number = 123;
		// System.in�� ǥ�� �Է��� �ǹ� �� Ű���带 �Է��Ѵ�. 
		// Ű���忡�� Ÿ�����ϴ� ���� �Է¹��� �� ���� �غ���� ��, �ʱ�ȭ
		Scanner kb = new Scanner(System.in); // 
		
		System.out.print("Please enter an integer: ");
		
		// Ű����� ���� ���� �ϳ��� �Է�.(Ű���忡�� ���� �о���δ�.)
		int input = kb.nextInt();  // == scanf("%d", &input);
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		
		kb.close(); //��ĳ�ʰ� �ʿ�������� ������ ��ĳ�ʸ� �ݾ���� �Ѵ�.
	}

}

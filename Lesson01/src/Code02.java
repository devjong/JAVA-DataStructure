import java.util.Scanner;

public class Code02 {
	public static void main(String[] args) {
		
		int number = 123;
		// Ű����� ���� �Է� �ޱ�   System.in�� ǥ�� �Է��� �ǹ� �� Ű���带 �Է��Ѵ�. 
		Scanner kb = new Scanner(System.in); // ��ĳ�ʸ� �����.
		
		System.out.print("Please enter an integer: ");
		
		int input = kb.nextInt(); // Ű����� ���� ���� �ϳ��� �Է¹޴´�.(Ű���忡�� ���� �о���δ�.)
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		
		kb.close(); //��ĳ�ʰ� �ʿ�������� ������ ��ĳ�ʸ� �ݾ���� �Ѵ�.
	}

}

import java.util.Scanner;

public class Code03 {
	public static void main(String[] args) {
		String str = "Hello, world";
		String input = null;
		
		Scanner keyboard = new Scanner(System.in); // System.in Ű���� �Է��� �ǹ���
		System.out.println("Please type a String: ");
		input = keyboard.nextLine();
		
		//�ΰ��� ���ڿ��� �������� �Ǵ��Ϸ��� equals()�� �˻���
		if(str.equals(input)) {  // input.equals(str)
			System.out.println("Strings match! :-)");
		} else {
			System.out.println("Strings do not match :-(");
		}
		
		// keyboard.next() �� ���ڸ� �����̵� ���� Hello, world��� Hello�� �о���δ�.
		// keyboard.nextLine() ���ڿ��� ������ �ȴ�. ���� Hello, world�� �Է��ߴٸ� Hello, world�� �о���δ�.
		// ������Ÿ�Ծƴ� ���� �� �������� ���ϼ��� �Ǵ��� == �� ���� ���Ѵ�. equals()�� �Ǵ� �� �� �ִ�.
		
		keyboard.close();
		
	}

}


public class Code01 {
	// ��а� �ܺδ� static�� �ٿ��ش�.
	static int num;
	
	public static void main(String[] args) {
		// ��а� static�� �ƴ� int�θ�
		int anotherNum = 5;
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		
		
		// Java���� +�� ���� �� �ϳ��� ���ڿ��̸� �ٸ��� �� ���ڿ��� �ؼ��Ͽ� �� ���ڿ��� ��ģ��.
		// ���� "Sum: " + num --> Sum: 2(����)   ----> "Sum: 2" + 5   --> "Sum: 25"(����)
		// left associativity  ���� + ���� = ���� -->  ���� + ���� --> ����
		System.out.println("Sum: " + num + anotherNum);
		
		System.out.println("Sum: " + (num + anotherNum));;

	}
}

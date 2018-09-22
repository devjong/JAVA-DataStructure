
public class Code01 {
	// 당분관 외부는 static을 붙여준다.
	static int num;
	
	public static void main(String[] args) {
		// 당분간 static이 아닌 int로만
		int anotherNum = 5;
		num = 2;
		
		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		
		
		// Java에서 +의 양쪽 중 하나가 문자열이면 다른쪽 도 문자열로 해석하여 두 문자열을 합친다.
		// 따라서 "Sum: " + num --> Sum: 2(문자)   ----> "Sum: 2" + 5   --> "Sum: 25"(문자)
		// left associativity  문자 + 숫자 = 문자 -->  문자 + 문자 --> 문자
		System.out.println("Sum: " + num + anotherNum);
		
		System.out.println("Sum: " + (num + anotherNum));;

	}
}

package 단항연산자.증감연산자;

public class 증감연산자테스트 {

	public static void main(String[] args) {
		int num1 = 20;
		//전위 증감연산 단독 사용
		++num1;
		System.out.println("num1 : " + num1);  //1 증가
		
		int num2 = 10;
		//후위 증감 연산 단독 사용
		num2++;
		System.out.println("num2 : " + num2); //1증가
		
		//다른 연산자와 함께 사용시에는 전위,후위에 따라 값변경결과가 달라진다.
		
		int a = 10;
		//다른 연산자와 함께  후위 연산을 사용한 경우
		int b = a++;
		System.out.println("a : "+ a); //값 1증가
		System.out.println("b : "+ b); //값 증가하지 않음 
		
		int c = 10;
		//다른 연산자와 함께 전위 연산을 사용한 경우
		int d = ++c;
		System.out.println("c : "+ c); //값 1증가
		System.out.println("d : "+ d); //값 1증가
		
	}

}

package 이항연산자.복합대입연산자;

public class 복합대입연산자 {

	public static void main(String[] args) {
		//복합대입연산자(누적대입연산자)
		int age = 20;
		//수행결과는 동일 
		//수행처리속도가 더 빨라 사용
		//age+=10;
		age = age+10;
		System.out.println(age);
		
		age+=10;
		System.out.println(age);

	}

}

package example.test1;

public class example1 {
	public void exampletest1() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++; //11
		System.out.println("a : "+a);
		b=(--a)+b; //a=10 b=20 따라서 b=30
		System.out.println("b : "+b);
		c=(a++)+(--b); // a=10 b=29 따라서 c=39
		System.out.println("c : "+c);

	}
	public void exampletest2() {
		
		int a = 100;
		int b = 200;
		int c = 100;
		int d = 250;
		
		System.out.println(a==c);
		System.out.println(!(a == b));
		System.out.println(a < b);
		System.out.println(!((a==b)&&(c==d)));
		
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		String str3 = "안녕하세요";
		
		System.out.println(str1 == str3);
		System.out.println(!((str1==str2)&&(str2==str3)));
		
	}
	public void exampletest3() {
		
		int su1 = 50;
		int su2 = 20;
		int su3 = 40;
		int su4 = 100;
		
		System.out.println((su1==su3)&&(su2==su4));
		System.out.println((su1==su3)||(su2==su4));
		
		
	}
	
	public void exampletest4() {
		
		int a = 10;
		int b = 0;
		String c = "hello";
		
		b +=10;   // b = 10
		System.out.println("b : "+b);
		a +=20;   // a = 30
		System.out.println("a : "+a);
		a /=b;    // a = 3
		System.out.println("a : "+a);
		b *=a;     // b = 30
		System.out.println("b : "+b);
		c +=b;    //hello30
		System.out.println("c : "+c);
		b -=a;    // b = 27
		System.out.println("b : "+b);
		
	}
	
	public void exampletest5() {
		
		int i = 16;
		int j = 11;
		
		System.out.println(i%2==0?"true":"false");
		System.out.println(j%2==0?"true":"false");
	}

}

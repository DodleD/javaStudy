import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		//키보드로 정수 두 개를 입력받아 두 수의 합, 차 곱, 나누기 한 몫을 입력하세요.
		Scanner sc = new Scanner(System.in);
		
		int num1, num2= 0;
		
		System.out.print("첫 번째 정수 : ");
		num1 = sc.nextInt();
		sc.nextLine();	
		
		System.out.print("두 번째 정수 : ");
		num2 = sc.nextInt();
		
		int n1=num1+num2;
		int n2=num1-num2;
		int n3=num1*num2;
		int n4=num1/num2;
		
		System.out.print("덧셈 결과 : " + n1 +"\n뺼셈 결과 : " + n2 + "\n곱셈 결과 : " + n3 +"\n나눗셈 결과" + n4);
		
	}

}

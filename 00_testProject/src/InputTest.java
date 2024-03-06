import java.util.Scanner; //스캐너 내부의 메소드를 호출

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		/*
		 * sc.next() : 공백(스페이스 전까지 가져옴)
		 * sc.nextLine : \n(엔터 입력 전까지 가져옴)
		 * sc.nextByte(), sc.nextShort(), sc.nextInt(), sc.nextLong(), sc.nextFloat(), sc.nextDouble
		 * 
		 * sc.close() : 입력대기 종료
		 * sc.hasNext() : 공간에 사용자로부터 입력받은 값이 남아있는지 확인
		 * 				  없으면 다른 값이 들어올때까지 무작정 기다림. 기다렸다가 true 반환
		 */
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 엔터입력으로 인한 개행문자 삭제방법
		
		
		System.out.print("주소를 입력하세요 : " );
		String add = sc.nextLine();
		
		System.out.print("이름은 : " + name + " / 나이는 : " + age + " / 주소는 : " + add);
		sc.close();
	}
}

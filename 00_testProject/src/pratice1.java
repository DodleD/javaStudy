import java.util.Scanner;

public class pratice1 {
	public static void main(String[] args) {
		/*
		 * 이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요,
		 */
		Scanner sc = new Scanner(System.in);
		
		String name, s;
		int age;
		double k;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		s = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		k = sc.nextDouble();
		
		System.out.print("키 "+k+"cm인 "+age+"살 "+s+"자 "+name+"님 반갑습니다 ^^");
		
		sc.close();
	}
	//char 형 scanner 입력 받는 방법 -> 강제 형변환 필요 sc.next().charAt(0);
	//sc.next().문자열(index) : 문자열에서 내가 원하는 index의 글자를 가져오는 것
}

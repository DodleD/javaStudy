import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		//영어 문자열 값을 키보드로 입력받아 문자에서 앞으로부터 3개를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();
		
		for(int i = 0 ; i<3;i++) {
			System.out.print("\n"+(i+1)+"번째 문자 : "+ a.charAt(i));
		}
	}

}
 
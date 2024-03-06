import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		//키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
		//공식 = 면적 : 가로*세로
		//둘레 : (가로+세로 )x2
		
		Scanner sc = new Scanner(System.in);
		double w, h, m, r = 0;
		
		System.out.print("가로 : ");
		w = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("세로 : ");
		h = sc.nextDouble();
		
		m = w*h;
		r = (w+h)*2;
		
		System.out.print("면적 : " + m + "\n둘레 : " + r);
	}

}

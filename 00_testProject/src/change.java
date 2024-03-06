// 형변환은 데이터 손실이 적은방향으로 일어난다.
// 대입연산과 일반연산시 같은 종류의 자료형으로만 가능하고 두 가지 이상의 서로 다른 자료형으로 계산 할 경우 한 가지 자료형으로 나오게 된다.
public class change {
	public static void main(String[] args) {
		
		double pi = 3.1415;
		int wholenumber = (int)pi;
		
		System.out.println(wholenumber);
		
		long num1 = 3000000007L;
		int num2 = (int)num1;
		
		System.out.println(num2);
		
		short num3 = 1;
		short num4 = 2;
		short num5 = (short)(num3+num4); //대입되는 순간 리터럴의 기본 값인 int 형으로 들어간다. 그렇기 때문에 Short로 강제 형변환 해야한다.
		
		System.out.println(num5);
	}
	
}

package ch10;

import java.util.*;
public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner s=null;
		try {
			int a,b;
			s=new Scanner(System.in);
			System.out.print("첫번째 숫자:");
			a=s.nextInt();
			System.out.print("두번째 숫자:");
			b=s.nextInt();
			System.out.println(a+"/"+b+"="+(a/b));
		}
		
		catch (ArithmeticException e) {
			System.out.println("0으로 입력하면 안되요");
		}
		catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야 합니다.");
		}
		catch (Exception e) {
			//이거는 맨마지막에 넣어야됨 나머지 다잡아서
			//다중 캐치틸때는 하위 Exception이 위에 와야한다.
		}
		finally {
			s.close();//사용후에 반드시 닫아야한다.
		}

	}

}

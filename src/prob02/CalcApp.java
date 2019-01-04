package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		Arithmetic arith;
		
		switch (operation) {
		case "+":
			arith = new Add();
			break;
		case "-":
			arith = new Sub();
			break;
		case "*":
			arith = new Mul();
			break;
		case "/":
			arith = new Div();
			break;

		default:
			arith = null;
			System.out.println("잘못된 연산자 입니다.");
			break;
		}

		if(arith != null)
		{
			System.out.println();
			System.out.println(arith.calculate(a, b));
		}
		
		scanner.close();
	}
}

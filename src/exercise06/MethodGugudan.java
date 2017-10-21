/**
 * 
 */
package exercise06;

import java.util.Scanner;

/**
 * @since 2017. 10. 21.
 * @author 구병국
 * 계산하는 메서드와 출력 메서드를 만들어서 호출하는 구구단 프로그램
 */
public class MethodGugudan {

	/*
	 * 결과 값을 입력할 배열을 만들고 원하는 단을 입력 받아서 해당 단의 결과값을 출력하는 구구단 프로그램을 만드시오.
	 * calculate메서드를 호출하여 단을 넘기고 해당 배열에 결과 값을 입력하도록 해당 배열을 리턴하시오.
	 * printInfo메서드를 호출하여 단과 배열을 넘기고 결과 값을 아래의 출력 형태로 나타나게 하시오.
	 */
	//	출력 예제
	//	단을 입력하시오. 2
	//	2단
	//	2*1=2		2*2=4 ....
	
	public static void main(String[] args) {
		
		int dan=getUserInput();
	
	}
	
	

	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}

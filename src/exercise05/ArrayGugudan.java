/**
 * 
 */
package exercise05;

import java.util.Scanner;

/**
 * @since 2017. 10. 21.
 * @author 구병국
 * 1차원 배열을 사용한 구구단 만들기
 */
public class ArrayGugudan {

//	1차원 배열에 입력 받은 곱샘의 결과 값을 넣고 그것을 출력하시오.
//	for each문을 사용해서 나타내시오.
//	출력 예제
//	단을 입력하시오. 2
//	2단
//	2*1=2		2*2=4 ....
	
	
	public static void main(String[] args) {
		int dan = getUserInput();
		

	}
	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}

/**
 * 
 */
package exercise03;

import java.util.Scanner;

/**
 * @since 2017. 10. 21.
 * @author 구병국
 * @변수를 입력 받아서 해당 단수의 구구단을 출력하기
 * 
 */

public class Gugudan {

//	getUserInput 메서드을 호출하여 해당 단을 입력 받아서 그 값에 해당하는 단을 출력 하세요.(for구문 사용)

//  출력형태
//	구구단 중에서 출력할 단은 몇단인가요?
//  4단
//  4*1=4
//  4*2=8
//  .....
	
	public static void main(String[] args) {
	
		int dan = getUserInput();
		
	}

/**
 * @return
 */
	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		return Integer.parseInt(input);
	}

}

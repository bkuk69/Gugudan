/**
 * 
 */
package exercise08;

import java.util.Scanner;

/**
 * @since 2017. 10. 21.
 * @author 구병국
 * Gugudan클래스의 갤체를 만들어서 출력하기 (생성자 이용)
 */
public class GugudanDrive {

	/**
	 * 단을 입력 받아서 Gugudan클래스의 객체를 만듭니다.
	 * 이때 입력 받은 값을 이용하여 생성자를 만들고  printInfo메서드를 호출하여 결과 값을 아래와 같이 표시하시오.
	 * 	 */
	//	출력 예제
	//	단을 입력하시오. 2
	//	2단
	//	2*1=2		2*2=4 ....

	
	public static void main(String[] args) {
		
		int dan= getUserInput();
	
		
	}
	
	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}


}

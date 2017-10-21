/**
 * 
 */
package exercise08;

import java.util.Scanner;

/**
 * @since 2017. 10. 21.
 * @author 구병국
 *  Gugudan클래스의 갤체를 만들어서 출력하기 (생성자 이용)
 */
public class GugudanDrive2 {
//	2차원 배열을 사용하여
//	반복문은 do -While 구문만 사용하여 아래와 같이 시작단과 끝단을 입력 받아서 배열에 저장한뒤에 구구단을 나타내시오.
//	만일 2~9 이외의 숫자를 입력하거나 끝단이 시작단 보다 작을 경우 바로 입력받을 때까지 무한 반복되도록 하시오. 
//	출력시 결과 값은 \t 를 사용하여 tab만큼 띄어쓰기를 하시오.
//	사용자의 입력을 받아서 구구단 클래스를 만들고 calculate와 printInfo를 호출하여 아래와 같은 출력 헝태가 되도록 만드시오.
//	출력형태
//	시작하는 단의 수를 입력하세요.(2~9)2
//	끝날 단수를 입력하세요.(2~9)5
//	2*1=2	2*2=4	2*3=6	2*4=8	2*5=10	2*6=12	2*7=14	2*8=16	2*9=18	
//	3*1=3	3*2=6	3*3=9	3*4=12	3*5=15	3*6=18	3*7=21	3*8=24	3*9=27	
//	4*1=4	4*2=8	4*3=12	4*4=16	4*5=20	4*6=24	4*7=28	4*8=32	4*9=36	
//	5*1=5	5*2=10	5*3=15	5*4=20	5*5=25	5*6=30	5*7=35	5*8=40	5*9=45	
	
	public static void main(String[] args) {
		int start =getUserInput();
		int end = getUserInput();

	}
	
	private static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}

/**
 * 
 */
package exercise03;

import java.util.Scanner;

/**
 * @since 2017. 10. 21.
 * @author ������
 * @������ �Է� �޾Ƽ� �ش� �ܼ��� �������� ����ϱ�
 * 
 */

public class Gugudan {

//	getUserInput �޼����� ȣ���Ͽ� �ش� ���� �Է� �޾Ƽ� �� ���� �ش��ϴ� ���� ��� �ϼ���.(for���� ���)

//  �������
//	������ �߿��� ����� ���� ����ΰ���?
//  4��
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

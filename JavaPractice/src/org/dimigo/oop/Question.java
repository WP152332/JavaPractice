/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *		|_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"가수는?", "배우는?", "과목은?"};
		String[] quest = {"SanE", "로다주", "응용프로그래밍"};
		String[] answer = {"S", "로", "밍"};
		for(int i =0; i < 3; i++) {
			System.out.println((i + 1) + ".가장 좋아하는 " + str[i]);
			Scanner scanner = new Scanner(System.in);
			answer[i] = scanner.nextLine();
			if(quest[i].equals(answer[i])) {
				System.out.println("정답입니다!");
			}
			else System.out.println("틀렸습니다!");
		}
		System.out.println("<< 결과 출력 >>");
		for(int i = 0; i < 3; i++) {
			System.out.println("가장 좋아하는 " + str[i] + quest[i] + "입니다.");
		}
	}

}

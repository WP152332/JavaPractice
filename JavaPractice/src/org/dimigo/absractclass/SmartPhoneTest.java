/**
 * 
 */
package org.dimigo.absractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] phone = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for (SmartPhone a : phone) {
			System.out.println(a);
			a.turnOn();
			a.pay();
			a.useSpecialFunction();
			a.turnOff();
		}
	}

}

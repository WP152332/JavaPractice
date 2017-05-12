/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *		|_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		for(Person pp : p) {
			greeting(pp);
		}
	}
	
	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();	
	}
}
/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *		|_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class FamilyMember {
	private static int memberCnt ;
	private String memberName;
	
	public FamilyMember(String memberName) {
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}

	/**
	 * @param familyMember
	 * @param i
	 */
}

/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *		|_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class Movie {
	private String title;
	private int limitage;
	
	public Movie(String title, int limitage) {
		this.title = title;
		this.limitage = limitage;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getLimitage() {
		return this.limitage;
	}
	
	public void buyTicket(int age) {
		try {
			if(age < this.limitage) throw new Exception(this.title + "은/는 " + this.limitage + "세 이상 관람가입니다.");
			else System.out.println(this.title + " 즐감하세요.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

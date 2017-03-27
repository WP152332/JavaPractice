/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *		|_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3() {
		
	}
	
	public Car3(String newCompany, String newModel, String newColor, int newmaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newmaxSpeed;
		price = newPrice;
	}
	public Car3(String newCompany, String newModel, String newColor, int newmaxSpeed) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newmaxSpeed;
	}
	public Car3(String newCompany, String newModel, String newColor) {
		company = newCompany;
		model = newModel;
		color = newColor;
	}
	public String getCompany() {
		return "제조사명 : " + company;
	}
	public String getModel() {
		return "모델명 : " + model;
	}
	public String getColor() {
		return "색상 : " +  color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
}

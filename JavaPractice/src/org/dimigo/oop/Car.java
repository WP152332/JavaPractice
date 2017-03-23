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
public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
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
	
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void setMaxSpeed(int newmaxSpeed) {
		maxSpeed = newmaxSpeed;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
}

package week6;

public class Card {
	private int value;
	private String name;
	
	//constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//getter and setter method for int value
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	//getter and setter for String name 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//describe method
	public void describe() {
		System.out.println(name + " (" + value + ")");
	}
}

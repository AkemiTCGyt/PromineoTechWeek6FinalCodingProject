package week6CodingProject;

public class Card {
	private int value; //contains a value from 2-14 representing cards 2-Ace
	private String name; //name of the said card
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String describe() { //returns String for ease of code use on line 20 of the application
		return "The value is: " + value + " the card name is: " + name;
	}
	
}

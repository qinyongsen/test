package com.test;

public enum NumberMapLetters {
	ZERO(0),
	ONE(1),
	TWO(2,"a","b","c"),
	THREE(3,"d","e","f"),
	FOUR(4,"g","h","i"),
	FIVE(5,"j","k","l"),
	SIX(6,"m","n","o"),
	SEVEN(7,"p","q","r","s"),
	EIGHT(8,"t","u","v"),
	NINE(9,"w","x","y","z");

	private int number;
	private String[] letters;
	NumberMapLetters(int number, String... letters) {
		this.number = number;
		this.letters = letters;
	}
	public int getNumber() {
		return number;
	}
	public String[] getLetters() {
		return letters;
	}
	public static NumberMapLetters getByNumber(int number){
		NumberMapLetters[] values = NumberMapLetters.values();
		for (NumberMapLetters numberMapLetters : values) {
			if(numberMapLetters.getNumber() == number){
				return numberMapLetters;
			}
		}
		return null;
	}
}
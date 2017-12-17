import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card> oneRoundCard;
	
	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
	}
	public String getName() {
		return name;
	}
	public int makeBet() {
		bet = 1;
		if(chips != 0) {
			return bet;
		}
		return 0;
	}
	public void setOneRoundCard(ArrayList<Card> cards) {
		oneRoundCard=cards;
	}
	public boolean hitMe() {
		int CardSum = 0;
		for(Card c:oneRoundCard) {
			CardSum += c.getRank();//add all cards' rank
		}
		if(CardSum <= 16) {
			return true;
		}
		return false;
	}
	public int getTotalValue() {
		int CardSum = 0;
		for(Card c:oneRoundCard) {
			CardSum += c.getRank();//add all cards' rank
		}
		return CardSum;
	}
	public int getCurrentChips() {
		return chips;
	}
	public void increaseChips (int diff) {
		chips += diff;
	}
	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}

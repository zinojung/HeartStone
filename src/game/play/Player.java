package game.play;

import java.util.ArrayList;

import game.card.Card;
import game.hero.Hero;

public class Player {
	private String name;
	private Hero hero;
	private ArrayList<Card> deck = new ArrayList<Card>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	public ArrayList<Card> getDeck() {
		return deck;
	}
	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	public Player putCardIntoDeck(Card card) {
		if(card instanceof Hero) {
			System.out.println("영웅카드는 덱에 넣을 수 없습니다.");
			return this;
		}
		this.deck.add(card);
		return this;
	}
	
	
}

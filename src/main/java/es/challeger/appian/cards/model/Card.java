package es.challeger.appian.cards.model;

import java.util.Objects;

import es.challeger.appian.cards.types.FaceCards;
import es.challeger.appian.cards.types.SuitsCards;

public class Card {
	
	private SuitsCards suitCard;
	private FaceCards faceCard;
	
	public Card(SuitsCards suitCard, FaceCards faceCard) {
		super();
		this.suitCard = suitCard;
		this.faceCard = faceCard;
	}

	public FaceCards getFaceCard() {
		return faceCard;
	}

	public SuitsCards getSuitCard() {
		return suitCard;
	}

	@Override
	public String toString() {
		return "Card [suitCard=" + suitCard + ", faceCard=" + faceCard + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(faceCard, suitCard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return faceCard == other.faceCard && suitCard == other.suitCard;
	}
	

}

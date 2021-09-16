package es.challenger.appian.test.cards.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.challeger.appian.cards.model.Card;
import es.challeger.appian.cards.types.FaceCards;
import es.challeger.appian.cards.types.SuitsCards;

class TestCard {
	
	@Test
	void propertiesCard() {
		
		Card card = new Card(SuitsCards.HEARTS, FaceCards.TEN);
		
		assertEquals(SuitsCards.HEARTS, card.getSuitCard());
		assertEquals(FaceCards.TEN, card.getFaceCard());
	}
	
	@Test
	void compareEqualsCard() {
		
		Card card1 = new Card(SuitsCards.HEARTS, FaceCards.TEN);
		Card card2 = new Card(SuitsCards.HEARTS, FaceCards.TEN);
		
		assertEquals(card1, card2);
		assertTrue(card1.equals(card1));
		assertTrue(card1.equals(card2));
		assertEquals(card1.hashCode(), card1.hashCode());
	}

	@Test
	void compareNotEqualsCard() {
		
		Card card1 = new Card(SuitsCards.HEARTS, FaceCards.TEN);
		Card card2 = new Card(SuitsCards.CLUBS, FaceCards.ACE);
		
		assertNotEquals(card1, card2);
		assertFalse(card1.equals(card2));
		assertFalse(card1.equals(null));
		assertFalse(card1.equals(Boolean.TRUE));
	}
}

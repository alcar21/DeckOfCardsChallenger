package es.challenger.appian.test.cards.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.challeger.appian.cards.model.Card;
import es.challeger.appian.cards.service.DeckOfCards;
import es.challeger.appian.cards.types.FaceCards;
import es.challeger.appian.cards.types.SuitsCards;

class TestDeckOfCards {
	
	private DeckOfCards deckOfCards;
	
	@BeforeEach
	public void initDeckCards() {
		deckOfCards = new DeckOfCards();
	}
	
	@Test
	void testInitializedAllCards() {
		
		assertEquals(deckOfCards.getCards().size(), (FaceCards.values().length * SuitsCards.values().length ));
		
	}
	
	@Test
	void testSuffleNumCards() {
		
		List<Card> copyCards = new ArrayList<Card>(FaceCards.values().length * SuitsCards.values().length );
		copyCards.addAll(deckOfCards.getCards());
		
		deckOfCards.shuffle();
		
		assertEquals(copyCards.size(), deckOfCards.getCards().size());
		
	}
	
	@Test
	void testSuffleIsOK() {
		
		List<Card> copyCards = new ArrayList<Card>(FaceCards.values().length * SuitsCards.values().length );
		copyCards.addAll(deckOfCards.getCards());
		
		assertEquals(copyCards,  deckOfCards.getCards());
		
		deckOfCards.shuffle();
		
		assertNotEquals(copyCards,  deckOfCards.getCards());
		
	}
	
	@Test
	void testDealOneCard() {
		
		Card card = deckOfCards.dealOneCard();
		
		assertNotNull(card);
		
	}
	
	@Test
	void testDealAllCard() {
		
		Card card = null;
		
		int sizeOfdeckOfCard = deckOfCards.getCards().size();

		for (int i = 0; i <= sizeOfdeckOfCard; i++) {
			
			card = deckOfCards.dealOneCard();
		}
		
		assertNull(card);
		
	}
	

}

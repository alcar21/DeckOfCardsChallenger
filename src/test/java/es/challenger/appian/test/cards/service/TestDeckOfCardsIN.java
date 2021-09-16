package es.challenger.appian.test.cards.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.challeger.appian.cards.model.Card;
import es.challeger.appian.cards.service.DeckOfCards;

class TestDeckOfCardsIN {
	
	private static Logger log = LoggerFactory.getLogger(TestDeckOfCardsIN.class);
	
	@Test
	void testDeckOfCardComplete() {
		
		DeckOfCards deckOfCards = new DeckOfCards();
		
		log.info("---- Before Suffle ");
		
		for (Card card: deckOfCards.getCards()) {
			
			log.info("Card; " + card);
		}
		
		deckOfCards.shuffle();
		log.info("---- After Suffle ");
		
		Card card = null;
		 
		for (int i = 0; i < 52; i++) {
			
			card = deckOfCards.dealOneCard();
			log.info("Card " +  (i + 1) + ": " + card);
		}
		
		assertNotNull(card);
				
	}
	
	@Test
	void testDeckOfCardCompleteWithOneCardMore() {
		
		DeckOfCards deckOfCards = new DeckOfCards();
		
		log.info("---- Before Suffle ");
		
		for (Card card: deckOfCards.getCards()) {
			
			log.info("Card; " + card);
		}
		
		deckOfCards.shuffle();
		log.info("---- After Suffle ");
		
		Card card = null;
		 
		for (int i = 0; i < 53; i++) {
			
			card = deckOfCards.dealOneCard();
			log.info("Card " +  (i + 1) + ": " + card);
		}
		
		assertNull(card);
				
	}

}

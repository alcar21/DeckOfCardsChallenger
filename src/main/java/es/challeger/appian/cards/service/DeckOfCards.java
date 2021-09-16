package es.challeger.appian.cards.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.challeger.appian.cards.model.Card;
import es.challeger.appian.cards.types.FaceCards;
import es.challeger.appian.cards.types.SuitsCards;


public class DeckOfCards {
	
	private static Logger log = LoggerFactory.getLogger(DeckOfCards.class);

	private List<Card> cards;
	private Random randomIntegers = new Random();

	public DeckOfCards() {
		
		cards = new ArrayList<>(FaceCards.values().length * SuitsCards.values().length );
		
		for (SuitsCards suitsCard : SuitsCards.values()) {
			for (FaceCards faceCard : FaceCards.values()) {
				cards.add(new Card(suitsCard, faceCard));
			}
		}
	}

	/**
	 * Shuffle returns no value, but results in the cards in the deck being randomly
	 * permuted.
	 * 
	 */
	public void shuffle() {

		for (int i = 0; i < cards.size(); i++) {

			var index = randomIntegers.nextInt(cards.size());
			var cardTmp = cards.set(index, cards.get(i));
			cards.set(i, cardTmp);
		}
	}

	/**
	 * This function should return one card from the deck to the caller.
	 * Specifically, a call to shuffle followed by 52 calls to dealOneCard() should
	 * result in the caller being provided all 52 cards of the deck in a random
	 * order. If the caller then makes a 53rd call dealOneCard(), no card is dealt.
	 * 
	 * @return Card or null
	 * 
	 */
	public Card dealOneCard() {

		if (cards.isEmpty()) {
			log.error("No more cards");
			return null;
		}

		return cards.remove(0);
	}

	public List<Card> getCards() {
		return cards;
	}

}

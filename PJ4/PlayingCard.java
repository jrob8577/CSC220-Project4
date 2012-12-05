package PJ4;

import java.util.*;

/**
 * class PlayingCardException: It is used for errors related to Card and Deck
 * objects Do not modify this class!
 */
class PlayingCardException extends Exception {

  /* Constructor to create a PlayingCardException object */
  PlayingCardException() {
    super();
  }

  PlayingCardException(String reason) {
    super(reason);
  }
}

/**
 * class Card : for creating playing card objects it is an immutable class. Rank
 * - valid values are 1 to 13 Suit - valid values are 0 to 3 Do not modify this
 * class!
 */
class Card {

  /* constant suits and ranks */
  static final String[] Suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
  static final String[] Rank = { "", "A", "2", "3", "4", "5", "6", "7", "8",
      "9", "10", "J", "Q", "K" };

  /* Data field of a card: rank and suit */
  private int cardRank; /* values: 1-13 (see Rank[] above) */
  private int cardSuit; /* values: 0-3 (see Suit[] above) */

  /* Constructor to create a card */
  /* throw PlayingCardException if rank or suit is invalid */
  public Card(int rank, int suit) throws PlayingCardException {
    if ((rank < 1) || (rank > 13))
      throw new PlayingCardException("Invalid rank:" + rank);
    else
      cardRank = rank;
    if ((suit < 0) || (suit > 3))
      throw new PlayingCardException("Invalid suit:" + suit);
    else
      cardSuit = suit;
  }

  /* Accessor and toString */
  public int getRank() {
    return cardRank;
  }

  public int getSuit() {
    return cardSuit;
  }

  public String toString() {
    return Rank[cardRank] + " " + Suit[cardSuit];
  }

  /* Few quick tests here */
  public static void main(String args[]) {
    try {
      Card c1 = new Card(1, 3);
      System.out.println(c1);
      c1 = new Card(10, 0);
      System.out.println(c1);
      c1 = new Card(10, 5); // generate exception here
    } catch (PlayingCardException e) {
      System.out.println("PlayingCardException: " + e.getMessage());
    }
  }
}

/**
 * class Deck represents a deck of 52 playing cards Use class Card to construct
 * 52 playing cards! Do not add new data fields or modify defined methods You
 * may add private methods
 */
class Deck {

  /* this is used to keep track of original 52 cards */
  private List<Card> originalDeck;

  /* this starts with 52 cards deck from original deck */
  /* it is used to keep track of remaining cards to deal */
  /* see reset(): it resets dealDeck to a original deck */
  private List<Card> dealDeck;

  /**
   * Constructor: Creates 52 playing cards in originalDeck and copy them to
   * dealDeck.
   * 
   * Note: You need to catch PlayingCardException from Card constructor Use
   * ArrayList for both originalDeck & dealDeck
   */
  public Deck() {
    // Use ArrayLists to create decks
    
    // instantiate the originalDeck
    // nested for loops; outer loop [0-3], inner loop [1-13]
    // within the loop, create a card and store into originalDeck
    
    // instantiate the dealDeck
    // Copy the originalDeck into the dealDeck (use the reset method)
  }

  /**
   * Task: Shuffles cards in deal deck. Hint: Look at java.util.Collections
   */
  public void shuffle() {
    // Hint: Look at java.util.Collections
  }

  /**
   * Task: Deals cards from the deal deck.
   * 
   * @param numberCards - number of cards to deal
   * @return a list containing cards that were dealt
   * @throw PlayingCardException if numberCard > number of remaining cards
   * 
   *        Note: You need to create ArrayList to stored dealt cards and should
   *        removed dealt cards from dealDeck
   * 
   */
  public List<Card> deal(int numberCards) throws PlayingCardException {
    // Remove numberCards from dealDeck
    // Put those into a new ArrayList
    // Return the new ArrayList
    
    return null;
  }

  /**
   * Task: Resets deal deck by getting all cards from the original deck.
   */
  public void reset() {
    // Copy the original deck into the deal deck
  }

  /**
   * Task: Return number of remaining cards in deal deck.
   */
  public int remain() {
    return dealDeck.size();
  }

  /**
   * Task: Returns a string representing cards in the deal deck
   */
  public String toString() {
    return "" + dealDeck;
  }

  /* Quick test */
  /* Do not modify these tests */
  public static void main(String args[]) {
    int numHands = 3;
    int cardsPerHand = 15;
    Deck deck = new Deck();

    for (int j = 0; j < 2; j++) {
      System.out.println("===========================");
      System.out.println("Before shuffle:" + deck);
      System.out.println("===========================");

      for (int i = 0; i < numHands; i++) {
        deck.shuffle();
        System.out.println("Shuffle:" + deck.remain() + " cards:" + deck);
        try {
          System.out.println("\n\nHand " + i + ":" + cardsPerHand + " cards:"
              + deck.deal(cardsPerHand));
        } catch (PlayingCardException e) {
          System.out.println(e.getMessage());
        }
        System.out.println("\n\nRemain:" + deck.remain() + " cards:" + deck);
        System.out.println("===========================");
      }
      deck.reset();
    }

    try {
      deck.deal(55);
    } catch (PlayingCardException e) {
      System.out.println("PlayingCardException: " + e.getMessage());
    }
    System.out.println("===========================");
  }

}

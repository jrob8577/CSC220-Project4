package PJ4;

import java.util.*;

/*
 * Ref: http://en.wikipedia.org/wiki/Video_poker
 *      http://www.google.com/ig/directory?type=gadgets&url=www.labpixies.com/campaigns/videopoker/videopoker.xml
 *
 *
 * Short Description and Poker rules:
 *
 * Video poker is also known as draw poker. 
 * The dealer uses a 52-card deck, which is played fresh after each currentHand. 
 * The player is dealt one five-card poker currentHand. 
 * After the first draw, which is automatic, you may hold any of the cards and draw 
 * again to replace the cards that you haven't chosen to hold. 
 * Your cards are compared to a table of winning combinations. 
 * The object is to get the best possible combination so that you earn the highest 
 * payout on the bet you placed. 
 *
 * Winning Combinations
 *  
 * 1. Jacks or Better: a pair pays out only if the cards in the pair are Jacks, 
 * 	Queens, Kings, or Aces. Lower pairs do not pay out. 
 * 2. Two Pair: two sets of pairs of the same card denomination. 
 * 3. Three of a Kind: three cards of the same denomination. 
 * 4. Straight: five consecutive denomination cards of different suit. 
 * 5. Flush: five non-consecutive denomination cards of the same suit. 
 * 6. Full House: a set of three cards of the same denomination plus 
 * 	a set of two cards of the same denomination. 
 * 7. Four of a kind: four cards of the same denomination. 
 * 8. Straight Flush: five consecutive denomination cards of the same suit. 
 * 9. Royal Flush: five consecutive denomination cards of the same suit, 
 * 	starting from 10 and ending with an ace
 *
 */

/* This is the main poker game class.
 * Please do not modify any data fields or defined methods
 * You may add new data fields and methods
 * Note: You must implement defined methods
 */

public class SimplePoker {

  // default constant values
  private static final int startingBalance = 100;
  private static final int numberOfCards = 5;

  // default constant payout value and currentHand types
  private static final int[] multipliers = { 1, 2, 3, 5, 6, 9, 25, 50, 250 };
  private static final String[] goodHandTypes = { "Royal Pair", "Two Pairs",
      "Three of a Kind", "Straight", "Flush	", "Full House", "Four of a Kind",
      "Straight Flush", "Royal Flush" };

  // must use only one deck
  private static final Deck deck = new Deck();

  // holding current poker hand, balance, bet
  private List<Card> currentHand;
  private int balance;
  private int bet;

  /** default constructor, set balance = startingBalance */
  public SimplePoker() {
    this(startingBalance);
  }

  /** constructor, set given balance */
  public SimplePoker(int balance) {
    this.balance = balance;
  }

  /**
   * This display the payout table based on multipliers and goodHandTypes arrays
   */
  private void showPayoutTable() {
    System.out.println("\n\n");
    System.out.println("Payout Table   	      Multiplier   ");
    System.out.println("=======================================");
    int size = multipliers.length;
    for (int i = size - 1; i >= 0; i--) {
      System.out.println(goodHandTypes[i] + "\t|\t" + multipliers[i]);
    }
    System.out.println("\n\n");
  }

  /**
   * Check current currentHand using multipliers and goodHandTypes arrays Must
   * print yourHandType (default is "Sorry, you lost") at the end of function.
   * This can be checked by testCheckHands() and main() method.
   */
  private void checkHands() {
    // goodHandTypes lists hands we're interestd in
    // SuitCounter - Array indexed by suit
    // RankCounter - Array indexed by rank
    // LowRank
    // High Rank
    // Straight - Logic to make sure it's a straight
  }

  /*************************************************
   * add new private methods here ....
   * I like to use private methods to further isolate
   * the logic in each step of playing a game...
   *************************************************/

  public void play() {
    /**
     * The main algorithm for single player poker game
     *     ++  
     *    show balance
     *    get valid bet
     *    update balance (current balance - bet)
     *    reset deck
     *    shuffle deck 
     *    deal and display cards (Deck's deal method, with numberOfCards)
     *    ask for position of cards to keep (not zero indexed, read line from console, split up the line into indeces)
     *    update cards (Deck's deal method, with numberOfCards - number of cards kept)
     *    check hands (call the method)
     *    display proper messages
     *    update balance if there is a payout (balance += bet * multiplier)
     *    if balance = O:
     *      end of program 
     *    else
     *      ask if the player wants to play a new game (prompt)
     *      if the answer is "no" : end of program
     *      else : showPayoutTable() if user wants to see it (prompt)
     *      repeat from beginning
     */

    // implement this method!

  }

  /**
   * Do not modify this. It is used to test checkHands() method checkHands()
   * should print your current hand type
   */
  public void testCheckHands() {
    try {
      currentHand = new ArrayList<Card>();

      // set Royal Flush
      currentHand.add(new Card(1, 3));
      currentHand.add(new Card(10, 3));
      currentHand.add(new Card(12, 3));
      currentHand.add(new Card(11, 3));
      currentHand.add(new Card(13, 3));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Straight Flush
      currentHand.set(0, new Card(9, 3));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Straight
      currentHand.set(4, new Card(8, 1));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Flush
      currentHand.set(4, new Card(5, 3));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // "Royal Pair" , "Two Pairs" , "Three of a Kind", "Straight", "Flush	",
      // "Full House", "Four of a Kind", "Straight Flush", "Royal Flush" };

      // set Four of a Kind
      currentHand.clear();
      currentHand.add(new Card(8, 3));
      currentHand.add(new Card(8, 0));
      currentHand.add(new Card(12, 3));
      currentHand.add(new Card(8, 1));
      currentHand.add(new Card(8, 2));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Three of a Kind
      currentHand.set(4, new Card(11, 3));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Full House
      currentHand.set(2, new Card(11, 1));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Two Pairs
      currentHand.set(1, new Card(9, 1));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // set Royal Pair
      currentHand.set(0, new Card(3, 1));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");

      // non Royal Pair
      currentHand.set(2, new Card(3, 3));
      System.out.println(currentHand);
      checkHands();
      System.out.println("-----------------------------------");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /* Quick test: testCheckHands() */
  public static void main(String args[]) {
    SimplePoker mypokergame = new SimplePoker();
    mypokergame.testCheckHands();
  }
}

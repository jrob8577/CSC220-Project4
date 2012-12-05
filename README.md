CSC220 Programming Project#4
============================
 
Due Date: Mid-night, Friday, December 21

*** No late projects will be accepted ****

- Upload a zip file, including PlayingCard.java and SimplePoker.java, to ilearn

- Implement poker game program in package PJ4:
 
      Part I  (40%) Implement Deck class
      Part II (60%) Implement SimplePoker class
 
      Bonus   (30%) Add GUI, only after you have completed I & II
                    Must complete by same due date
  		    Talk to me before you start this part. 
 
  See PJ4/PlayingCard.java and VPJ4/ideoPoker.java for more info. 
 

- Use PJ4_Test.java to test correctness of your proggram

- Compile programs (you are in directory containing Readme file):
	
  javac PJ4/*.java
  javac PJ4_Test.java

- Run programs (you are in directory containing Readme file):

  // Run tests in PJ4 classes 
  java PJ4.Deck
  java PJ4.SimplePoker

  // Run main test program
  java PJ4_Test		


************************************************************************************************************
  
- Sample output :  java PJ4.Deck

===========================
Before shuffle:[A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]
===========================
Shuffle:52 cards:[8 Diamonds, A Diamonds, K Hearts, 9 Clubs, J Spades, 7 Spades, Q Clubs, 4 Spades, A Hearts, Q Spades, 9 Spades, K Diamonds, 6 Spades, 6 Diamonds, 6 Clubs, 2 Spades, 7 Hearts, 3 Diamonds, 5 Hearts, Q Diamonds, Q Hearts, 9 Hearts, 5 Clubs, 2 Diamonds, 7 Clubs, 2 Hearts, 10 Hearts, A Spades, 4 Clubs, A Clubs, 6 Hearts, 4 Hearts, 4 Diamonds, 3 Clubs, 3 Hearts, 8 Hearts, 8 Spades, 10 Clubs, 9 Diamonds, 10 Diamonds, K Spades, 7 Diamonds, K Clubs, 5 Diamonds, J Clubs, J Hearts, J Diamonds, 2 Clubs, 5 Spades, 10 Spades, 3 Spades, 8 Clubs]


Hand 0:15 cards:[10 Clubs, 9 Diamonds, 10 Diamonds, K Spades, 7 Diamonds, K Clubs, 5 Diamonds, J Clubs, J Hearts, J Diamonds, 2 Clubs, 5 Spades, 10 Spades, 3 Spades, 8 Clubs]


Remain:37 cards:[8 Diamonds, A Diamonds, K Hearts, 9 Clubs, J Spades, 7 Spades, Q Clubs, 4 Spades, A Hearts, Q Spades, 9 Spades, K Diamonds, 6 Spades, 6 Diamonds, 6 Clubs, 2 Spades, 7 Hearts, 3 Diamonds, 5 Hearts, Q Diamonds, Q Hearts, 9 Hearts, 5 Clubs, 2 Diamonds, 7 Clubs, 2 Hearts, 10 Hearts, A Spades, 4 Clubs, A Clubs, 6 Hearts, 4 Hearts, 4 Diamonds, 3 Clubs, 3 Hearts, 8 Hearts, 8 Spades]
===========================
Shuffle:37 cards:[Q Diamonds, 5 Hearts, 9 Clubs, 3 Hearts, J Spades, 6 Diamonds, K Diamonds, 6 Hearts, A Hearts, Q Clubs, 7 Clubs, K Hearts, 7 Hearts, 2 Hearts, 9 Hearts, 4 Diamonds, 4 Clubs, 8 Hearts, 3 Diamonds, 2 Spades, 10 Hearts, 9 Spades, 8 Diamonds, Q Spades, 5 Clubs, 3 Clubs, 8 Spades, 6 Clubs, 7 Spades, A Spades, 2 Diamonds, 6 Spades, 4 Spades, Q Hearts, A Clubs, A Diamonds, 4 Hearts]


Hand 1:15 cards:[8 Diamonds, Q Spades, 5 Clubs, 3 Clubs, 8 Spades, 6 Clubs, 7 Spades, A Spades, 2 Diamonds, 6 Spades, 4 Spades, Q Hearts, A Clubs, A Diamonds, 4 Hearts]


Remain:22 cards:[Q Diamonds, 5 Hearts, 9 Clubs, 3 Hearts, J Spades, 6 Diamonds, K Diamonds, 6 Hearts, A Hearts, Q Clubs, 7 Clubs, K Hearts, 7 Hearts, 2 Hearts, 9 Hearts, 4 Diamonds, 4 Clubs, 8 Hearts, 3 Diamonds, 2 Spades, 10 Hearts, 9 Spades]
===========================
Shuffle:22 cards:[5 Hearts, 6 Hearts, 2 Hearts, K Diamonds, 9 Spades, 7 Clubs, 4 Clubs, 9 Clubs, A Hearts, 10 Hearts, 3 Hearts, 3 Diamonds, Q Diamonds, K Hearts, 7 Hearts, 8 Hearts, Q Clubs, J Spades, 4 Diamonds, 9 Hearts, 2 Spades, 6 Diamonds]


Hand 2:15 cards:[9 Clubs, A Hearts, 10 Hearts, 3 Hearts, 3 Diamonds, Q Diamonds, K Hearts, 7 Hearts, 8 Hearts, Q Clubs, J Spades, 4 Diamonds, 9 Hearts, 2 Spades, 6 Diamonds]


Remain:7 cards:[5 Hearts, 6 Hearts, 2 Hearts, K Diamonds, 9 Spades, 7 Clubs, 4 Clubs]
===========================
===========================
Before shuffle:[A Clubs, 2 Clubs, 3 Clubs, 4 Clubs, 5 Clubs, 6 Clubs, 7 Clubs, 8 Clubs, 9 Clubs, 10 Clubs, J Clubs, Q Clubs, K Clubs, A Diamonds, 2 Diamonds, 3 Diamonds, 4 Diamonds, 5 Diamonds, 6 Diamonds, 7 Diamonds, 8 Diamonds, 9 Diamonds, 10 Diamonds, J Diamonds, Q Diamonds, K Diamonds, A Hearts, 2 Hearts, 3 Hearts, 4 Hearts, 5 Hearts, 6 Hearts, 7 Hearts, 8 Hearts, 9 Hearts, 10 Hearts, J Hearts, Q Hearts, K Hearts, A Spades, 2 Spades, 3 Spades, 4 Spades, 5 Spades, 6 Spades, 7 Spades, 8 Spades, 9 Spades, 10 Spades, J Spades, Q Spades, K Spades]
===========================
Shuffle:52 cards:[J Hearts, 7 Diamonds, Q Hearts, 5 Hearts, J Clubs, A Diamonds, J Diamonds, 7 Hearts, 6 Diamonds, 7 Clubs, 4 Clubs, A Hearts, 5 Spades, Q Clubs, 5 Clubs, 4 Hearts, 10 Clubs, 4 Spades, 6 Spades, A Spades, Q Diamonds, K Clubs, 5 Diamonds, 9 Spades, 7 Spades, 9 Diamonds, 6 Hearts, 3 Hearts, 10 Spades, 2 Hearts, 6 Clubs, 8 Spades, 2 Spades, Q Spades, 3 Spades, J Spades, K Spades, 10 Diamonds, 9 Hearts, 9 Clubs, 8 Clubs, 10 Hearts, K Diamonds, 2 Clubs, 3 Diamonds, 4 Diamonds, K Hearts, 2 Diamonds, 3 Clubs, A Clubs, 8 Diamonds, 8 Hearts]


Hand 0:15 cards:[10 Diamonds, 9 Hearts, 9 Clubs, 8 Clubs, 10 Hearts, K Diamonds, 2 Clubs, 3 Diamonds, 4 Diamonds, K Hearts, 2 Diamonds, 3 Clubs, A Clubs, 8 Diamonds, 8 Hearts]


Remain:37 cards:[J Hearts, 7 Diamonds, Q Hearts, 5 Hearts, J Clubs, A Diamonds, J Diamonds, 7 Hearts, 6 Diamonds, 7 Clubs, 4 Clubs, A Hearts, 5 Spades, Q Clubs, 5 Clubs, 4 Hearts, 10 Clubs, 4 Spades, 6 Spades, A Spades, Q Diamonds, K Clubs, 5 Diamonds, 9 Spades, 7 Spades, 9 Diamonds, 6 Hearts, 3 Hearts, 10 Spades, 2 Hearts, 6 Clubs, 8 Spades, 2 Spades, Q Spades, 3 Spades, J Spades, K Spades]
===========================
Shuffle:37 cards:[K Clubs, A Hearts, 2 Hearts, 8 Spades, 5 Hearts, 9 Spades, 10 Clubs, Q Diamonds, 6 Spades, 5 Clubs, 9 Diamonds, 7 Clubs, J Diamonds, 7 Diamonds, 4 Hearts, 4 Clubs, 10 Spades, Q Spades, K Spades, J Spades, 4 Spades, 6 Clubs, 5 Diamonds, 3 Hearts, 6 Hearts, 2 Spades, 5 Spades, 6 Diamonds, J Clubs, Q Hearts, 7 Hearts, A Diamonds, A Spades, J Hearts, 7 Spades, 3 Spades, Q Clubs]


Hand 1:15 cards:[5 Diamonds, 3 Hearts, 6 Hearts, 2 Spades, 5 Spades, 6 Diamonds, J Clubs, Q Hearts, 7 Hearts, A Diamonds, A Spades, J Hearts, 7 Spades, 3 Spades, Q Clubs]


Remain:22 cards:[K Clubs, A Hearts, 2 Hearts, 8 Spades, 5 Hearts, 9 Spades, 10 Clubs, Q Diamonds, 6 Spades, 5 Clubs, 9 Diamonds, 7 Clubs, J Diamonds, 7 Diamonds, 4 Hearts, 4 Clubs, 10 Spades, Q Spades, K Spades, J Spades, 4 Spades, 6 Clubs]
===========================
Shuffle:22 cards:[A Hearts, 9 Spades, 6 Clubs, 6 Spades, J Diamonds, 10 Spades, 8 Spades, J Spades, Q Spades, K Clubs, 7 Clubs, 2 Hearts, K Spades, 9 Diamonds, 4 Spades, 10 Clubs, 4 Clubs, 4 Hearts, 5 Hearts, 5 Clubs, 7 Diamonds, Q Diamonds]


Hand 2:15 cards:[J Spades, Q Spades, K Clubs, 7 Clubs, 2 Hearts, K Spades, 9 Diamonds, 4 Spades, 10 Clubs, 4 Clubs, 4 Hearts, 5 Hearts, 5 Clubs, 7 Diamonds, Q Diamonds]


Remain:7 cards:[A Hearts, 9 Spades, 6 Clubs, 6 Spades, J Diamonds, 10 Spades, 8 Spades]
===========================
PlayingCardException: Not enough cards to deal
===========================

************************************************************************************************************

- Sample output : java PJ4.SimplePoker

[A Spades, 10 Spades, Q Spades, J Spades, K Spades]
Royal Flush!
-----------------------------------
[9 Spades, 10 Spades, Q Spades, J Spades, K Spades]
Straight Flush!
-----------------------------------
[9 Spades, 10 Spades, Q Spades, J Spades, 8 Diamonds]
Straight!
-----------------------------------
[9 Spades, 10 Spades, Q Spades, J Spades, 5 Spades]
Flush!
-----------------------------------
[8 Spades, 8 Clubs, Q Spades, 8 Diamonds, 8 Hearts]
Four of a Kind!
-----------------------------------
[8 Spades, 8 Clubs, Q Spades, 8 Diamonds, J Spades]
Three of a Kind!
-----------------------------------
[8 Spades, 8 Clubs, J Diamonds, 8 Diamonds, J Spades]
Full House!
-----------------------------------
[8 Spades, 9 Diamonds, J Diamonds, 8 Diamonds, J Spades]
Two Pairs!
-----------------------------------
[3 Diamonds, 9 Diamonds, J Diamonds, 8 Diamonds, J Spades]
Royal Pair!
-----------------------------------
[3 Diamonds, 9 Diamonds, 3 Spades, 8 Diamonds, J Spades]
Sorry, you lost!
-----------------------------------


************************************************************************************************************

$ java PJ4_Test 1000



Payout Table          Multiplier
=======================================
Royal Flush     |       250
Straight Flush  |       50
Four of a Kind  |       25
Full House      |       9
Flush           |       6
Straight        |       5
Three of a Kind |       3
Two Pairs       |       2
Royal Pair      |       1



-----------------------------------
Balance:$1000
Enter bet:500
Hand:[2 Diamonds, K Spades, 6 Clubs, 9 Clubs, 4 Spades]
Enter positions of cards to keep (e.g. 1 4 5 ):2 3
Hand:[10 Diamonds, K Spades, 6 Clubs, 6 Diamonds, 9 Hearts]
Sorry, you lost!

Your balance:$500, one more game (y or n)?y

Want to see payout table (y or n)n
-----------------------------------
Balance:$500
Enter bet:600
insufficient fund!
Enter bet:500
Hand:[A Diamonds, 9 Hearts, 6 Clubs, K Hearts, A Hearts]
Enter positions of cards to keep (e.g. 1 4 5 ):1 5
Hand:[A Diamonds, 4 Diamonds, 9 Diamonds, J Spades, A Hearts]
Royal Pair!

Your balance:$500, one more game (y or n)?y

Want to see payout table (y or n)y



Payout Table          Multiplier
=======================================
Royal Flush     |       250
Straight Flush  |       50
Four of a Kind  |       25
Full House      |       9
Flush           |       6
Straight        |       5
Three of a Kind |       3
Two Pairs       |       2
Royal Pair      |       1



-----------------------------------
Balance:$500
Enter bet:500
Hand:[8 Clubs, 4 Spades, J Hearts, 9 Clubs, 10 Diamonds]
Enter positions of cards to keep (e.g. 1 4 5 ):1 2 3 4 5
Hand:[8 Clubs, 4 Spades, J Hearts, 9 Clubs, 10 Diamonds]
Sorry, you lost!

Your balance is 0
Bye!


	

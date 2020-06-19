package IntervewTasks;

import java.util.ArrayList;
import java.util.List;

public class Cards {


//    public static Game deal(List<Player> players, Deck deck) {
//        Assert.notNull(players, "Players cannot be null");
//        Assert.notNull(deck, "Deck cannot be null");
//        // TODO: this is where the work goes
//        // TODO: this is NOT the correct solution, it is simply returning the input values
//
//        int playersSize = players.size();
//
//        if(players.size() > 52){
//            return new Game(players, deck);  // if players more than 52, then they not gonna play and we will not deal the cards
//        }
//
//        shuffle(deck);
//
//        int remainder = deck.getCards().size() % playersSize;
//
//        ArrayList<List<Card>> cardsForPlayer = new ArrayList<>();
//        for(int i = 0; i < players.size(); i++){
//            List<Card> cards = new ArrayList<>();
//            cardsForPlayer.add(cards);
//        }
//
//        int index = 0;
//        for(int i = 0; i < deck.getCards().size() - remainder; i++){
//
//            cardsForPlayer.get(index).add(deck.getCards().get(i));
//
//            if(index == cardsForPlayer.size() - 1){
//                index = -1;
//            }
//
//            index++;
//
//        }
//
//        for(int i = 0; i < players.size(); i++){
//            players.get(i).setCards(cardsForPlayer.get(i));
//        }
//
//        List<Card> undealtCards = new ArrayList<>();
//
//        if(remainder > 0){
//            for(int i = deck.getCards().size() - remainder; i < deck.getCards().size(); i++){
//                undealtCards.add(deck.getCards().get(i));
//            }
//        }
//
//        return new Game(players, undealtCards);
//    }
//
//
//    public static Game deal(List<Player> players, Deck deck, int numberOfCardsPerPlayer) {
//        Assert.notNull(players, "Players cannot be null");
//        Assert.notNull(deck, "Deck cannot be null");
//        // TODO: this is where the work goes
//        // TODO: this is NOT the correct solution, it is simply returning the input values
//
//        int playersSize = players.size();
//
//        int AllCardsForPlayers = playersSize * numberOfCardsPerPlayer;
//
//        if(AllCardsForPlayers > 52){
//            return new Game(players, deck);  /* if they need more than 52 cards, then
//                                             they not gonna play and we will not deal the cards */
//        }
//
//        shuffle(deck);
//
//        int remainder = deck.getCards().size() - AllCardsForPlayers;
//
//
//        ArrayList<List<Card>> cardsForPlayer = new ArrayList<>();
//        for(int i = 0; i < players.size(); i++){
//            List<Card> cards = new ArrayList<>();
//            cardsForPlayer.add(cards);
//        }
//
//        int index = 0;
//        for(int i = 0; i < deck.getCards().size() - remainder; i++){
//
//            cardsForPlayer.get(index).add(deck.getCards().get(i));
//
//            if(index == cardsForPlayer.size() - 1){
//                index = -1;
//            }
//
//            index++;
//
//        }
//
//        for(int i = 0; i < players.size(); i++){
//            players.get(i).setCards(cardsForPlayer.get(i));
//        }
//
//        List<Card> undealtCards = new ArrayList<>();
//
//        if(remainder > 0){
//            for(int i = deck.getCards().size() - remainder; i < deck.getCards().size(); i++){
//                undealtCards.add(deck.getCards().get(i));
//            }
//        }
//
//        return new Game(players, undealtCards);
//    }



}

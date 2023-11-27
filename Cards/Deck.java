package Cards;

import java.util.Random;

public class Deck extends Card {

    Card[] randomCard;

    public Deck(String name, String desc) {
        super(name, desc);

    }


    Random random = new Random();
    

    public Card[] getRandomCard(Card[] card) {
        for(int i = 0; i < card.length; i++) {
            randomCard[i] = new NormalMonsterCard(getID(), getName(), getAttack(), getDefence(), getLevel(), getDescription());
            System.out.println("" + randomCard);

        }

        return randomCard;
    }


  
}

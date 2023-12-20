package Cards;

import java.util.Random;

public class CardGenerator {
    private Random random = new Random();

    public Card GenerateRandomCard() throws Exception {
        int cardType = random.nextInt(2); // for now there are only 3 type of card: NormalMonsterCard | Spell card | Trap card
        switch (cardType) {
            case 0:
                return new NormalMonsterCard(getID(), getRandomName(), getRandomAtk(), getRandomDef(), getRandomLevel());
            
            case 1: 
                return new SpellCard(getID(), getRandomName(), getEffect());

            case 2:
                return new TrapCard(getID(), getRandomName(), getEffect());
        
            default:
                throw new Exception("generate random card probably bugging");
        }
    }
    
    private int getID() {
        int id = 0;
        
        return id;  // At the moment i dont how to check to see if ID is unique or not
    }

    private String getRandomName() {
        int name = random.nextInt(5);

        switch(name){
            case 0:
            return "ogre";
            
            case 1:
            return "goblin";

            case 2:
            return "necromancer";

            case 3:
            return "wizard";

            case 4:
            return "him";

            case 5:
            return "her";

            default:
            return "no name";
        }
    }

    private int getRandomAtk() {
        int unRoundAtk = random.nextInt(1200, 2000);
        int roundAtk = Math.round(unRoundAtk/100) * 100; 
        return roundAtk;
    }

    private int getRandomDef() {
        int unRoundDef = random.nextInt(1200, 2000);
        int roundDef = Math.round(unRoundDef/100) * 100; 
        return roundDef;
    }

    private int getRandomLevel() {
        return random.nextInt(1, 10);
    }

    private String getEffect() {
        return null; // implement later as right now im focus on monster card
    }
}

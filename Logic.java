
import Cards.NormalMonsterCard;

public class Logic {
    NormalMonsterCard ogre = new NormalMonsterCard("ogre", 1600, 1200, 4, "big bonk real stronk");
    NormalMonsterCard goblin = new NormalMonsterCard("goblin", 1400, 900, 3, "speedy but weakly");

    public static void main(String[] args) {
        new Logic();
    }
    
    public Logic() {
        int remainder = cardAttack();
        System.out.print("" + remainder);
    }

    public int cardAttack() {
        int opponentLifePoint = 0;
        int userLifePoint = 0;
        int ogreAtk = ogre.getAttack();
        int goblinAtk = goblin.getAttack();
        int goblinDef = goblin.getAttack();
        boolean isFaceUp = goblin.isFaceUp();

        if(ogreAtk > goblinAtk && goblin.isFaceUp()) {
            opponentLifePoint = ogreAtk - goblinAtk;
            // get rid of card
            return opponentLifePoint;
        } else if (ogreAtk < goblinAtk && isFaceUp){
            userLifePoint = goblinAtk - ogreAtk;
            // get rid of card
            return userLifePoint;
        } else if (ogreAtk < goblinDef && !(isFaceUp)){
            userLifePoint = goblinAtk - ogreAtk;
            isFaceUp = true;
            return userLifePoint;
        } else if (ogreAtk > goblinDef && !(goblin.isFaceUp())){
            // get rid of card
            isFaceUp = true;
            return 0;
        } 
        return 0;
    }


}

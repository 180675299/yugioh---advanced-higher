
import Cards.NormalMonsterCard;

public class Logic {
    NormalMonsterCard ogre = new NormalMonsterCard(0,"ogre", 1600, 1200, 4, "big bonk real stronk");
    NormalMonsterCard goblin = new NormalMonsterCard(1,"goblin", 1400, 900, 3, "speedy but weakly");
    
    public static void main(String[] args) {
        new Logic();
    }
    
    public Logic() {
        new GameScreen();
        
        int remainder = cardAttack();
        System.out.print("" + remainder);
    }

    public int cardAttack() {
        int opponentLifePoint = 8000;
        int userLifePoint = 8000;
        int ogreAtk = ogre.getAttack();
        int goblinAtk = goblin.getAttack();
        int goblinDef = goblin.getAttack();
        boolean isFaceUp = goblin.isFaceUp();

        if(ogre.getAttack() > goblin.getAttack()) {
            opponentLifePoint = opponentLifePoint - (ogreAtk - goblinAtk);
            // get rid of card
            // return opponentLifePoint;
        // } else if (ogreAtk < goblinAtk && goblin.isFaceUp()){
        //     userLifePoint = goblinAtk - ogreAtk;
        //     // get rid of card
        // } else if (ogreAtk < goblinDef && goblin.isFaceUp() == false){
        //     userLifePoint = goblinAtk - ogreAtk;
        //     isFaceUp = true;
        // } else if (ogreAtk > goblinDef && goblin.isFaceUp() == false){
        //     // get rid of card
        //     isFaceUp = true;
        } 
        return opponentLifePoint;
    }


}

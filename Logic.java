public class Logic {
    Card card1 = new Card("ogre", 1600, 1200, 4, "big bonk real stronk");
    Card card2 = new Card("goblin", 1400, 900, 3, "speedy but weakly");

    public static void main(String[] args) {
        new Logic();
    }
    
    public Logic() {
        int remainder = cardAttack();
        System.out.print("" + remainder);
    }

    public int cardAttack() {
        int lifePoint = card1.attack - card2.attack;

        return lifePoint;
    }

}

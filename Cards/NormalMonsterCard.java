package Cards;

public class NormalMonsterCard extends Card {

    public NormalMonsterCard(int ID, String name, int atk, int def, int lvl, String desc) {
        super(name, desc);
        setFaceUp(true);
    }
    
}

package Cards;

public class NormalMonsterCard extends Card {

    private int attack;
    private int defence;

    public NormalMonsterCard(int ID, String name, int atk, int def, int lvl) {
        super(ID, name);
        // setFaceUp(true);
    }

    public int getATK() {
        return attack;
    }

    public int getDEF() {
        return defence;
    }
    
}

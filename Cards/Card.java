package Cards;
public class Card {
    private int attack;
    String name;
    private int defence;
    int level;
    String description;
    private boolean faceUp;

    public Card(String name, String desc) {
        this.name = name;
        this.description = desc;
        setFaceUp(true);
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

}

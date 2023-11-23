public class Card {
    String name;
    int attack;
    int defence;
    int level;
    String description;
    boolean faceUp;

    public Card(String name, int atk, int def, int lvl, String desc) {
        this.name = name;
        this.attack = atk;
        this.defence = def;
        this.level = lvl;
        this.description = desc;
        faceUp = true;
    }

}

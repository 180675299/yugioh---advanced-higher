package Cards;

public class SpellCard extends Card {

    private String effect;

    public SpellCard(int ID, String name, String effect) {
        super(ID, name);
    }
    
    public String getEffect() {
        return effect;
    }
}

package Cards;

public class TrapCard extends Card {

    private String effect;
    
    public TrapCard(int ID, String name, String effect) {
        super(ID, name);
    }
    
    public String getEffect() {
        return effect;
    }
}

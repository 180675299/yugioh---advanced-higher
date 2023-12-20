package Cards;
public class Card {
    private int ID;
    private String name;

    public Card(int ID, String name) {
        this.name = name;
        //setFaceUp(true); implement later
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

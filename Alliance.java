import players.Opponent;
import players.Player;
import players.User;

public enum Alliance {

    USER {
        @Override
        public int getDirection() {
            return -1;
        }

        @Override
        public boolean isOpponent() {
            return false;
        }

        @Override
        public boolean isUser() {
            return true;
        }

        @Override
        public Player choosePlayer(final User user, final Opponent opponent) {
            return user;
        }

    },    
    
    OPPONENT {
        @Override
        public int getDirection() {
            return 1;
        }

        @Override
        public boolean isOpponent() {
            return true;
        }

        @Override
        public boolean isUser() {
            return false;
        }

        @Override
        public Player choosePlayer(final User user, final Opponent opponent) {
            return opponent;
        }
    }; 
    
    public abstract int getDirection();
    public abstract boolean isOpponent();
    public abstract boolean isUser();
    public abstract Player choosePlayer(User user, Opponent opponent);
    
    
}

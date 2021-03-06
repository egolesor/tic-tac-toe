package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public abstract class Player {

    private final String name;
    private final String surname;
    private final PlayerType type;

    public Player(String name, String surname, PlayerType type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public abstract  Shape shape();

    public String wholeName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return wholeName() + " [ " + shape() + " ] ";
    }

    public PlayerType type(){
        return type;
    }
}

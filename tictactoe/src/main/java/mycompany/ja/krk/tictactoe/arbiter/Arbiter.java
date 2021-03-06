package epam.ja.krk.tictactoe.arbiter;

import epam.ja.krk.tictactoe.map.Shape;

/**
 * Created by ehsan on 24.06.16.
 */
public interface Arbiter {

    boolean areYouHandleThis(String fieldNumber);

    boolean isTheMapFull();

    /**
     * At the beggining the game choose one or the first player will be choosen by default
     *
     * @param shape
     */
    void letToPlay(Shape shape);

    /**
     * getting the current player
     * @return
     */
    Shape whoIsPlaying();

    boolean wantsToContinue();

    Shape whoIsTheWinner();
}

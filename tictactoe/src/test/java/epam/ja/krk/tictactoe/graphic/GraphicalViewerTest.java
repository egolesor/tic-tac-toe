package epam.ja.krk.tictactoe.graphic;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiter;
import epam.ja.krk.tictactoe.map.Shape;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 24.06.16.
 */
public class GraphicalViewerTest {


    /**
     * Putting O in the middle of the map
     */
    @Test
    public void firstScenario(){

        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.areYouHandleThis("5");

        Assert.assertTrue(map.hasShapeOnTheField("5", Shape.O));
    }

    /**
     * Putting more X O
     */
    @Test
    public void secondScenarioTest(){

        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());
        Arbiter arbiter = new SimpleArbiter(map);
        arbiter.letToPlay(Shape.O);
        arbiter.areYouHandleThis("5");
        arbiter.areYouHandleThis("4");
        arbiter.areYouHandleThis("3");
        arbiter.areYouHandleThis("2");
        arbiter.areYouHandleThis("1");
        arbiter.areYouHandleThis("6");

        Assert.assertTrue(map.hasShapeOnTheField("2", Shape.X));


    }



}

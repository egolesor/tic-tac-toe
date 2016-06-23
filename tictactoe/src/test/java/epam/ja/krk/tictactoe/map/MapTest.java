package epam.ja.krk.tictactoe.map;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 23.06.16.
 */
public class MapTest {

    @Test
    public void freeFieldTest(){
        TicTacToeField theField = new TicTacToeSimpleField();
        Assert.assertTrue(theField.isFree());
    }


    @Test
    public void shapeOFieldTest(){
        TicTacToeField theField = new TicTacToeSimpleField();
        theField.put(Shape.O);
        Assert.assertEquals(Shape.O, theField.shape());
    }

    @Test
    public void shapeXFieldTest(){
        TicTacToeField theField = new TicTacToeSimpleField();
        theField.put(Shape.X);
        Assert.assertEquals(Shape.X, theField.shape());
    }

    @Test
    public void mapOfFieldsTest(){
        TicTacToeMapBuilder builder = new  TicTacToeMapBuilder();
        TicTacToeMap ticTacToeMap = new TicTacToeSimpleMap(builder.simpleTicTacToeMap());
        Assert.assertTrue(ticTacToeMap.getField("2").isFree());
    }

}

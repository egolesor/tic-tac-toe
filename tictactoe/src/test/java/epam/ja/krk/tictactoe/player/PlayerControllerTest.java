package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ehsan on 28.06.16.
 */
public class PlayerControllerTest {

    @Test
    public void playerType(){
        PlayerO playerO = new PlayerO("Name", "surname", PlayerType.HUMAN);
        PlayerX playerX = new PlayerX("Name", "surname", PlayerType.HUMAN);
        PlayerController playerController = new SimplePlayerController(playerO, playerX);

        Assert.assertEquals(playerController.getTypeOfPlayer(Shape.X), PlayerType.HUMAN);
    }


}

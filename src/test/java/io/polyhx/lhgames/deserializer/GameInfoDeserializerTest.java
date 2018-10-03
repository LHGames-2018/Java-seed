package io.polyhx.lhgames.deserializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.polyhx.lhgames.game.GameInfo;
import io.polyhx.lhgames.game.Player;
import io.polyhx.lhgames.game.tile.TileContent;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameInfoDeserializerTest {
    private final static String TEST_JSON = "{" +
            "\"Player\":{" +
                    "\"Health\":2," +
                    "\"MaxHealth\":2," +
                    "\"CarriedResources\":0," +
                    "\"CarryingCapacity\":1002," +
                    "\"CollectingSpeed\":2.0," +
                    "\"TotalResources\":3000," +
                    "\"AttackPower\":4," +
                    "\"Defence\":5," +
                    "\"Position\":{\"x\":22,\"y\":23}," +
                    "\"HouseLocation\":{\"x\":40,\"y\":54}," +
                    "\"Score\":0," +
                    "\"Name\":\"Player 1\"," +
                    "\"UpgradeLevels\":[0,3,4,2,1]," +
                    "\"CarriedItems\":[0,2,2,3,1,4]" +
            "}," +
            "\"CustomSerializedMap\":\"[[{1},{3},{2}],[{},{},{4,5000,1}],[{},{},{}]]\"," +
            "\"xMin\":20," +
            "\"yMin\":40" +
    "}";

    @Test
    public void deserialize() {
        Gson gson  = new GsonBuilder().registerTypeAdapter(GameInfo.class, new GameInfoDeserializer()).create();
        GameInfo game = gson.fromJson(TEST_JSON, GameInfo.class);

        assertEquals(game.getPlayer().getPosition().getX(), 22);
        assertEquals(game.getPlayer().getPosition().getY(), 23);
        assertEquals(game.getPlayer().getHousePosition().getX(), 40);
        assertEquals(game.getPlayer().getHousePosition().getY(), 54);
        assertEquals(game.getPlayer().getCurrentHealth(), 2);
        assertEquals(game.getPlayer().getMaximumHealth(), 2);
        assertEquals(game.getPlayer().getCarriedResource(), 0);
        assertEquals(game.getPlayer().getResourceCapacity(), 1002);
        assertEquals(game.getPlayer().getTotalResource(), 3000);
        assertEquals(game.getPlayer().getAttack(), 4);
        assertEquals(game.getPlayer().getDefence(), 5);
        assertEquals(game.getPlayer().getScore(), 0);
        assertEquals(game.getPlayer().getCollectingSpeed(), 2.0,0.01);
        assertEquals(game.getPlayer().getName(), "Player 1");

        assertEquals(game.getMap().getTile(20,40).getPosition().getX(), 20);
        assertEquals(game.getMap().getTile(20,40).getPosition().getY(), 40);
        assertEquals(game.getMap().getTile(20,40).getContent(), TileContent.WALL);

        assertEquals(game.getMap().getTile(21,40).getPosition().getX(), 21);
        assertEquals(game.getMap().getTile(21,40).getPosition().getY(), 40);
        assertEquals(game.getMap().getTile(21,40).getContent(), TileContent.LAVA);

        assertEquals(game.getMap().getTile(22,40).getPosition().getX(), 22);
        assertEquals(game.getMap().getTile(22,40).getPosition().getY(), 40);
        assertEquals(game.getMap().getTile(22,40).getContent(), TileContent.HOUSE);

        assertEquals(game.getMap().getTile(20,41).getPosition().getX(), 20);
        assertEquals(game.getMap().getTile(20,41).getPosition().getY(), 41);
        assertEquals(game.getMap().getTile(20,41).getContent(), TileContent.EMPTY);

        assertEquals(game.getMap().getTile(21,41).getPosition().getX(), 21);
        assertEquals(game.getMap().getTile(21,41).getPosition().getY(), 41);
        assertEquals(game.getMap().getTile(21,41).getContent(), TileContent.EMPTY);

        assertEquals(game.getMap().getTile(22,41).getPosition().getX(), 22);
        assertEquals(game.getMap().getTile(22,41).getPosition().getY(), 41);
        assertEquals(game.getMap().getTile(22,41).getContent(), TileContent.RESOURCE);

        assertEquals(game.getMap().getTile(20,42).getPosition().getX(), 20);
        assertEquals(game.getMap().getTile(20,42).getPosition().getY(), 42);
        assertEquals(game.getMap().getTile(20,42).getContent(), TileContent.EMPTY);

        assertEquals(game.getMap().getTile(21,42).getPosition().getX(), 21);
        assertEquals(game.getMap().getTile(21,42).getPosition().getY(), 42);
        assertEquals(game.getMap().getTile(21,42).getContent(), TileContent.EMPTY);

        assertEquals(game.getMap().getTile(22,42).getPosition().getX(), 22);
        assertEquals(game.getMap().getTile(22,42).getPosition().getY(), 42);
        assertEquals(game.getMap().getTile(22,42).getContent(), TileContent.EMPTY);

        assertEquals(game.getMap().getResources().size(), 1);
        assertEquals(game.getMap().getResources().get(0).getContent(), TileContent.RESOURCE);
        assertEquals(game.getMap().getResources().get(0).getResource(), 5000);
        assertEquals(game.getMap().getResources().get(0).getDensity(), 1);

        assertEquals(game.getMap().getRelativePoint().getX(), 20);
        assertEquals(game.getMap().getRelativePoint().getY(), 40);
    }
}
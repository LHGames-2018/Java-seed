package io.polyhx.lhgames.deserializer;

import io.polyhx.lhgames.game.Map;
import io.polyhx.lhgames.game.Point;
import io.polyhx.lhgames.game.tile.TileContent;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapDeserializerTest {
    /**
     * The test data for the equivalent map:
     *
     *      [1] [ ] [ ]
     *      [3] [ ] [ ]
     *      [2] [4] [ ]
     *
     */
    private static final String TEST_DATA = "[[{1},{3},{2}],[{},{},{4,5000,1}],[{},{},{}]]";

    @Test
    public void deserialize() {
        MapDeserializer deserializer = new MapDeserializer();
        Map map = deserializer.deserialize(TEST_DATA, new Point(0,0));

        assertEquals(map.getTile(0,0).getPosition().getX(), 0);
        assertEquals(map.getTile(0,0).getPosition().getY(), 0);
        assertEquals(map.getTile(0,0).getContent(), TileContent.WALL);

        assertEquals(map.getTile(1,0).getPosition().getX(), 1);
        assertEquals(map.getTile(1,0).getPosition().getY(), 0);
        assertEquals(map.getTile(1,0).getContent(), TileContent.EMPTY);

        assertEquals(map.getTile(2,0).getPosition().getX(), 2);
        assertEquals(map.getTile(2,0).getPosition().getY(), 0);
        assertEquals(map.getTile(2,0).getContent(), TileContent.EMPTY);

        assertEquals(map.getTile(0,1).getPosition().getX(), 0);
        assertEquals(map.getTile(0,1).getPosition().getY(), 1);
        assertEquals(map.getTile(0,1).getContent(), TileContent.LAVA);

        assertEquals(map.getTile(1,1).getPosition().getX(), 1);
        assertEquals(map.getTile(1,1).getPosition().getY(), 1);
        assertEquals(map.getTile(1,1).getContent(), TileContent.EMPTY);

        assertEquals(map.getTile(2,1).getPosition().getX(), 2);
        assertEquals(map.getTile(2,1).getPosition().getY(), 1);
        assertEquals(map.getTile(2,1).getContent(), TileContent.EMPTY);

        assertEquals(map.getTile(0,2).getPosition().getX(), 0);
        assertEquals(map.getTile(0,2).getPosition().getY(), 2);
        assertEquals(map.getTile(0,2).getContent(), TileContent.HOUSE);

        assertEquals(map.getTile(1,2).getPosition().getX(), 1);
        assertEquals(map.getTile(1,2).getPosition().getY(), 2);
        assertEquals(map.getTile(1,2).getContent(), TileContent.RESOURCE);

        assertEquals(map.getTile(2,2).getPosition().getX(), 2);
        assertEquals(map.getTile(2,2).getPosition().getY(), 2);
        assertEquals(map.getTile(2,2).getContent(), TileContent.EMPTY);

        assertEquals(map.getResources().size(), 1);
        assertEquals(map.getResources().get(0).getContent(), TileContent.RESOURCE);
        assertEquals(map.getResources().get(0).getResource(), 5000);
        assertEquals(map.getResources().get(0).getDensity(), 1);

        assertEquals(map.getRelativePoint().getX(), 0);
        assertEquals(map.getRelativePoint().getY(), 0);
    }
}
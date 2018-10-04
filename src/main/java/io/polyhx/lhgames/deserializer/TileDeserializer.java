////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.deserializer;

import io.polyhx.lhgames.game.point.Point;
import io.polyhx.lhgames.game.tile.ResourceTile;
import io.polyhx.lhgames.game.tile.Tile;
import io.polyhx.lhgames.game.tile.TileContent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TileDeserializer {
    private static final Map<Integer,TileContent> TILE_ID_MAP;
    static {
        TILE_ID_MAP = new HashMap<>();
        TILE_ID_MAP.put(TileContent.EMPTY.getID(), TileContent.EMPTY);
        TILE_ID_MAP.put(TileContent.WALL.getID(), TileContent.WALL);
        TILE_ID_MAP.put(TileContent.HOUSE.getID(), TileContent.HOUSE);
        TILE_ID_MAP.put(TileContent.LAVA.getID(), TileContent.LAVA);
        TILE_ID_MAP.put(TileContent.RESOURCE.getID(), TileContent.RESOURCE);
        TILE_ID_MAP.put(TileContent.SHOP.getID(), TileContent.SHOP);
        TILE_ID_MAP.put(TileContent.PLAYER.getID(), TileContent.PLAYER);
    }

    private final List<ResourceTile> fResources;

    public TileDeserializer(List<ResourceTile> resources) {
        fResources = resources;
    }

    public Tile deserialize(List<Float> data, Point position) {
        /* empty tile */
        if (data.size() == 0) {
            return new Tile(position, TileContent.EMPTY);
        }

        /* tile other than a resource */
        if (data.get(0) != TileContent.RESOURCE.getID()) {
            /* they all have one parameter */
            if (data.size() != 1) {
                System.out.println("Non resource tile doesn't have one parameter: " + data);
                return new Tile(position, TileContent.EMPTY);
            }

            /* get the tile content */
            TileContent content = TILE_ID_MAP.get(data.get(0).intValue());
            if (content == null) {
                System.out.println("Fail to get tile content: " + data);
                return new Tile(position, TileContent.EMPTY);
            }

            /* create the tile */
            return new Tile(position, content);
        }

        /* a resource has 3 parameters */
        if (data.size() != 3) {
            System.out.println("Resource tile doesn't have three parameters: " + data);
            return new Tile(position, TileContent.EMPTY);
        }

        /* create the resource tile and add it to the resource list */
        ResourceTile tile = new ResourceTile(position, data.get(1).intValue(), data.get(2));
        fResources.add(tile);
        return tile;
    }
}

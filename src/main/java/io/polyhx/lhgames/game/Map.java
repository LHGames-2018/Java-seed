////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game;

import io.polyhx.lhgames.game.tile.ResourceTile;
import io.polyhx.lhgames.game.tile.Tile;

import java.util.List;

public class Map {
    private final List<List<Tile>> fTiles;
    private final List<ResourceTile> fResources;
    private final Point fRelativeTo;

    public Map(List<List<Tile>> tiles, List<ResourceTile> resources, Point relative) {
        fTiles = tiles;
        fResources = resources;
        fRelativeTo = relative;
    }

    public Tile getTile(int x, int y) {
        /* get coordinate relative to the 2D array */
        x -= fRelativeTo.getX();
        y -= fRelativeTo.getY();

        /* get the tile */
        List<Tile> tiles = fTiles.get(x);
        if(tiles == null) return null;
        return tiles.get(y);
    }

    public List<List<Tile>> getTiles() {
        return fTiles;
    }

    public List<ResourceTile> getResources() {
        return fResources;
    }

    public Point getRelativePoint() {
        return fRelativeTo;
    }
}

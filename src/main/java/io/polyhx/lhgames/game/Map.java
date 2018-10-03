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
        /* TODO: need to be safer */
        return fTiles.get(y - fRelativeTo.getY()).get(x - fRelativeTo.getX());
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

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

        /* make sure the x coordinate is inside the map */
        if(x < 0 || x >= fTiles.size()) return null;

        /* get the column */
        List<Tile> column = fTiles.get(x);

        /* make sure the y coordinate is inside the map */
        if(y < 0 || y >= column.size()) return null;

        /* get the actual tile */
        return column.get(y);
    }

    public Tile getTile(Point point) {
        return getTile(point.getX(), point.getY());
    }

    public Tile getTileAboveOf(Point point) {
        return getTile(point.getX(), point.getY()+1);
    }

    public Tile getTileBelowOf(Point point) {
        return getTile(point.getX(), point.getY()-1);
    }

    public Tile getTileRightOf(Point point) {
        return getTile(point.getX()+1, point.getY());
    }

    public Tile getTileLeftOf(Point point) {
        return getTile(point.getX()-1, point.getY());
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

    public void print() {
        for(List<Tile> tiles : fTiles) {
            for(Tile tile : tiles) {
                System.out.print(tile.getContent().getSymbol() + " ");
            }
            System.out.println(" ");
        }
    }
}

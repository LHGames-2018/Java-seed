package io.polyhx.lhgames.game.tile;

import io.polyhx.lhgames.game.Point;

public class ResourceTile extends Tile {
    private final int fResource;
    private final int fDensity;

    public ResourceTile(Point position, int resource, int density) {
        super(position, TileContent.RESOURCE);
        fResource = resource;
        fDensity = density;
    }

    public int getResource() {
        return fResource;
    }

    public int getDensity() {
        return fDensity;
    }
}

package io.polyhx.lhgames.game.tile;

import io.polyhx.lhgames.game.Point;

public class ResourceTile extends Tile {
    private final int fResource;
    private final float fDensity;

    public ResourceTile(Point position, int resource, float density) {
        super(position, TileContent.RESOURCE);
        fResource = resource;
        fDensity = density;
    }

    public int getResource() {
        return fResource;
    }

    public float getDensity() {
        return fDensity;
    }
}

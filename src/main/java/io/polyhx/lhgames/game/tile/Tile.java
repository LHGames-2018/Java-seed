package io.polyhx.lhgames.game.tile;

import io.polyhx.lhgames.game.Point;

public class Tile {
    private final Point fPosition;
    private final TileContent fContent;

    public Tile(Point position, TileContent content) {
        fPosition = position;
        fContent = content;
    }

    public Point getPosition() {
        return fPosition;
    }

    public TileContent getContent() {
        return fContent;
    }

    public boolean isEmpty() {
        return (fContent == TileContent.EMPTY);
    }

    public boolean isWall() {
        return (fContent == TileContent.WALL);
    }

    public boolean isHouse() {
        return (fContent == TileContent.HOUSE);
    }

    public boolean isLava() {
        return (fContent == TileContent.LAVA);
    }

    public boolean isResource() {
        return (fContent == TileContent.RESOURCE);
    }

    public boolean isShop() {
        return (fContent == TileContent.SHOP);
    }

    public boolean isPlayer() {
        return (fContent == TileContent.PLAYER);
    }
}

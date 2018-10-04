package io.polyhx.lhgames.game.tile;

import io.polyhx.lhgames.game.Point;

public class Tile extends Point {
    private final TileContent fContent;

    public Tile(Point position, TileContent content) {
        super(position);
        fContent = content;
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

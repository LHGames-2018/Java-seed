package io.polyhx.lhgames.game.tile;

public enum TileContent {
    EMPTY(0),
    WALL(1),
    HOUSE(2),
    LAVA(3),
    RESOURCE(4),
    SHOP(5),
    PLAYER(6);

    private final int fID;

    TileContent(int id) {
        fID = id;
    }

    public int getID() {
        return fID;
    }
}

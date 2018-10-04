package io.polyhx.lhgames.game.tile;

public enum TileContent {
    EMPTY(0, ' '),
    WALL(1, 'X'),
    HOUSE(2, 'H'),
    LAVA(3, 'L'),
    RESOURCE(4, 'R'),
    SHOP(5, 'S'),
    PLAYER(6, 'P');

    private final int fID;

    private final char fSymbol;

    TileContent(int id, char symbol) {
        fID = id;
        fSymbol = symbol;
    }

    public int getID() {
        return fID;
    }

    public char getSymbol() {
        return fSymbol;
    }
}

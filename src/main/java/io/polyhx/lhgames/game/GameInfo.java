package io.polyhx.lhgames.game;

public class GameInfo {
    private final Player fPlayer;
    private final Map fMap;

    public GameInfo(Player player, Map map) {
        fPlayer = player;
        fMap = map;
    }

    public Player getPlayer() {
        return fPlayer;
    }

    public Map getMap() {
        return fMap;
    }
}

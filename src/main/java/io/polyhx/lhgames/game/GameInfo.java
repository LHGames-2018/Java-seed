////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game;

public class GameInfo {
    private final Player fPlayer;
    private final Map fMap;
    private final boolean fAreWallsBreakable;

    public GameInfo(Player player, Map map, boolean wallBreakable) {
        fPlayer = player;
        fMap = map;
        fAreWallsBreakable = wallBreakable;
    }

    public Player getPlayer() {
        return fPlayer;
    }

    public Map getMap() {
        return fMap;
    }

    public boolean areWallsBreakable() {
        return fAreWallsBreakable;
    }
}

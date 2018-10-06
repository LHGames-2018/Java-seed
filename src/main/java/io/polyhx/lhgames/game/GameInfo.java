////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game;

import java.util.List;

public class GameInfo {
    private final Player fPlayer;
    private final Map fMap;
    private final List<Player> fOtherPlayers;
    private final boolean fAreWallsBreakable;

    public GameInfo(Player player, Map map, List<Player> others, boolean wallBreakable) {
        fPlayer = player;
        fMap = map;
        fOtherPlayers = others;
        fAreWallsBreakable = wallBreakable;
    }

    public Player getPlayer() {
        return fPlayer;
    }

    public Map getMap() {
        return fMap;
    }

    public List<Player> getOtherPlayers() {
        return fOtherPlayers;
    }

    public boolean areWallsBreakable() {
        return fAreWallsBreakable;
    }
}

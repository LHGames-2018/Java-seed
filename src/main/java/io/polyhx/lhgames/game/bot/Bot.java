package io.polyhx.lhgames.game.bot;

import io.polyhx.lhgames.game.Map;
import io.polyhx.lhgames.game.Player;
import io.polyhx.lhgames.game.action.IAction;
import io.polyhx.lhgames.game.point.Point;

public class Bot extends BaseBot {
    public IAction getAction(Player player, Map map) {
        return createMoveAction(Point.RIGHT);
    }
}

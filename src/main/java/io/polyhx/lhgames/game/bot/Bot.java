package io.polyhx.lhgames.game;

import io.polyhx.lhgames.game.action.IAction;
import io.polyhx.lhgames.game.action.MoveAction;
import io.polyhx.lhgames.game.point.Point;

public class Bot {
    public IAction getAction(Player player, Map map) {
        return new MoveAction(Point.RIGHT);
    }
}

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.Point;

public class MoveAction extends AbstractPointAction {
    public MoveAction(Point point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.MOVE;
    }
}

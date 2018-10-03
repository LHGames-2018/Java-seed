package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.Point;

public class CollectAction extends AbstractPointAction {
    public CollectAction(Point point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.COLLECT;
    }
}

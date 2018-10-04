////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.Point;

public class CollectAction extends AbstractPointAction {
    public CollectAction(Point point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.COLLECT;
    }
}

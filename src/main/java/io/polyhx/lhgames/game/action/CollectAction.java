////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.IPoint;

public class CollectAction extends AbstractPointAction {
    public CollectAction(IPoint point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.COLLECT;
    }
}

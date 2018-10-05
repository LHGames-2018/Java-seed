////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.IPoint;

public class StealAction extends AbstractPointAction {
    public StealAction(IPoint point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.STEAL;
    }
}

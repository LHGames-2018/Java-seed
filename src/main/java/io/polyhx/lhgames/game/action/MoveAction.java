////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.IPoint;

public class MoveAction extends AbstractPointAction {
    public MoveAction(IPoint point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.MOVE;
    }
}

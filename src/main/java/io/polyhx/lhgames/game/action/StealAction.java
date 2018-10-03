////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.Point;

public class StealAction extends AbstractPointAction {
    public StealAction(Point point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.STEAL;
    }
}

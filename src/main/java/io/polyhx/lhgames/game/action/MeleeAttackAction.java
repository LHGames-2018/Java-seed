////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.IPoint;

public class MeleeAttackAction extends AbstractPointAction {
    public MeleeAttackAction(IPoint point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.MELEE_ATTACK;
    }
}

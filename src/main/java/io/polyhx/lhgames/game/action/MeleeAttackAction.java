////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.Point;

public class MeleeAttackAction extends AbstractPointAction {
    public MeleeAttackAction(Point point) {
        super(point);
    }

    @Override
    public ActionType getActionType() {
        return ActionType.MELEE_ATTACK;
    }
}

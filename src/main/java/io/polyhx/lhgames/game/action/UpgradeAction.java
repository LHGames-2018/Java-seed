////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.Upgrade;

public class UpgradeAction implements IAction {
    private final Upgrade fUpgrade;

    public UpgradeAction(Upgrade upgrade) {
        fUpgrade = upgrade;
    }

    @Override
    public ActionType getActionType() {
        return ActionType.UPGRADE;
    }

    @Override
    public String getJSONContent() {
        return fUpgrade.getJSON();
    }
}
////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

public enum ActionType {
    STEAL("StealAction"),
    MELEE_ATTACK("MeleeAttackAction"),
    COLLECT("CollectAction"),
    MOVE("MoveAction"),
    UPGRADE("UpgradeAction"),
    PURCHASE("PurchaseAction"),
    HEAL("HealAction");

    private final String fJSON;

    ActionType(String json) {
        fJSON = json;
    }

    public String getJSON() {
        return fJSON;
    }
}

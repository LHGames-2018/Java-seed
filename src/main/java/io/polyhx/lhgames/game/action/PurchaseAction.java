////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.Item;

public class PurchaseAction implements IAction {
    private final Item fItem;

    public PurchaseAction(Item item) {
        fItem = item;
    }

    @Override
    public ActionType getActionType() {
        return ActionType.PURCHASE;
    }

    @Override
    public String getJSONContent() {
        return fItem.getJSON();
    }
}
package io.polyhx.lhgames.game.action;

public class HealAction implements IAction {
    @Override
    public ActionType getActionType() {
        return ActionType.HEAL;
    }

    @Override
    public String getJSONContent() {
        return "";
    }
}

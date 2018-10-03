package io.polyhx.lhgames.game;

public enum Upgrade {
    CARRYING_CAPACITY("CarryingCapacity"),
    MAXIMUM_HEALTH("MaximumHealth"),
    COLLECTING_SPEED("CollectingSpeed"),
    ATTACK("AttackPower"),
    DEFENCE("Defence");

    private final String fJSON;

    Upgrade(String json) {
        fJSON = json;
    }

    public String getJSON() {
        return fJSON;
    }
}

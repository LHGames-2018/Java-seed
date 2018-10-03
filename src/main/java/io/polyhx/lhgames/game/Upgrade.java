package io.polyhx.lhgames.game;

public enum Upgrade {
    CARRYING_CAPACITY("CarryingCapacity", 0),
    MAXIMUM_HEALTH("MaximumHealth", 3),
    COLLECTING_SPEED("CollectingSpeed", 4),
    ATTACK("AttackPower", 1),
    DEFENCE("Defence", 2);

    private final String fJSON;
    private final int fID;

    Upgrade(String json, int id) {
        fJSON = json;
        fID = id;
    }

    public String getJSON() {
        return fJSON;
    }

    public int getID() {
        return fID;
    }
}
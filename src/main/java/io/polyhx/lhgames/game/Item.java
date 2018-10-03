package io.polyhx.lhgames.game;

public enum Item {
    SWORD("Sword"),
    SHIELD("Shield"),
    BACKPACK("Backpack"),
    PICKAXE("Pickaxe"),
    HEALTH_POTION("HealthPotion");

    private final String fJSON;

    Item(String json) {
        fJSON = json;
    }

    public String getJSON() {
        return fJSON;
    }
}

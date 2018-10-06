////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game;

import java.util.HashMap;

public enum Item {
    SWORD("Sword", 0),
    SHIELD("Shield", 1),
    BACKPACK("Backpack", 2),
    PICKAXE("Pickaxe", 3),
    HEALTH_POTION("HealthPotion", 4);

    private final String fJSON;
    private final int fID;

    Item(String json, int id) {
        fJSON = json;
        fID = id;
    }

    public String getJSON() {
        return fJSON;
    }

    public int getID() {
        return fID;
    }

    private static final HashMap<Integer, Item> ITEM_ID_MAP;

    static {
        ITEM_ID_MAP = new HashMap<>();
        ITEM_ID_MAP.put(Item.SWORD.getID(), Item.SWORD);
        ITEM_ID_MAP.put(Item.SHIELD.getID(), Item.SHIELD);
        ITEM_ID_MAP.put(Item.BACKPACK.getID(), Item.BACKPACK);
        ITEM_ID_MAP.put(Item.PICKAXE.getID(), Item.PICKAXE);
        ITEM_ID_MAP.put(Item.HEALTH_POTION.getID(), Item.HEALTH_POTION);
    }

    public static Item fromID(int id) {
        return ITEM_ID_MAP.get(id);
    }
}

package io.polyhx.lhgames.game.bot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import io.polyhx.lhgames.game.Item;
import io.polyhx.lhgames.game.Upgrade;
import io.polyhx.lhgames.game.action.*;
import io.polyhx.lhgames.game.point.IPoint;

import java.io.*;

public class BaseBot {
    private final String fBotDataPath;

    protected BotData fBotData;

    public BaseBot() {
        fBotDataPath = "/data/bot.json";
        fBotData = new BotData();
        load();
    }

    public void save() {
        /* create the writer */
        FileWriter writer = null;
        try {
            writer = new FileWriter(fBotDataPath);
        } catch (IOException e) {
            System.out.println("Failed to save bot's data: " + e);
            return;
        }

        /* create the JSON serializer */
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        /* serialize the bot's data */
        try {
            gson.toJson(fBotData, writer);
            writer.flush();
            writer.close();
        } catch (JsonIOException e) {
            System.out.println("Failed to save bot's data: " + e);
            return;
        } catch (IOException e) {
            System.out.println("Failed to save bot's data: " + e);
            return;
        }

        System.out.println("should be saved");
    }

    public void load() {
        /* make sure the data file exists */
        File datafile = new File(fBotDataPath);
        if (!datafile.exists()) {
            System.out.println("Failed to load bot's data: file doesn't exist");
            return;
        }

        /* create the reader */
        FileReader reader = null;
        try {
            reader = new FileReader(datafile);
        } catch (FileNotFoundException e) {
            System.out.println("Failed to load bot's data: " + e);
            return;
        }

        /* deserialize the data */
        BotData loaded;
        try {
            Gson gson = new Gson();
            loaded = gson.fromJson(reader, BotData.class);
        } catch (JsonSyntaxException e) {
            System.out.println("Failed to load bot's data: " + e);
            return;
        }

        /* use the new data */
        if(loaded != null) {
            fBotData = loaded;
        }
    }

    static StealAction createStealAction(IPoint point) {
        return new StealAction(point);
    }

    static MeleeAttackAction createMeleeAttackAction(IPoint point) {
        return new MeleeAttackAction(point);
    }

    static CollectAction createCollectAction(IPoint point) {
        return new CollectAction(point);
    }

    static MoveAction createMoveAction(IPoint point) {
        return new MoveAction(point);
    }

    static UpgradeAction createUpgradeAction(Upgrade upgrade) {
        return new UpgradeAction(upgrade);
    }

    static PurchaseAction createPurchaseAction(Item item) {
        return new PurchaseAction(item);
    }

    static HealAction createHealAction() {
        return new HealAction();
    }
}

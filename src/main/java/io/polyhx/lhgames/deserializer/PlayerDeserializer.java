////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.deserializer;

import com.google.gson.*;
import io.polyhx.lhgames.game.Player;
import io.polyhx.lhgames.game.Point;

import java.lang.reflect.Type;

public class PlayerDeserializer implements JsonDeserializer<Player> {
    @Override
    public Player deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();
        return new Player(
                new PointDeserializer().deserialize(obj.get("Position"), Point.class, context),
                new PointDeserializer().deserialize(obj.get("HouseLocation"), Point.class, context),
                obj.get("Health").getAsInt(),
                obj.get("MaxHealth").getAsInt(),
                obj.get("CarriedResources").getAsInt(),
                obj.get("CarryingCapacity").getAsInt(),
                obj.get("TotalResources").getAsInt(),
                obj.get("AttackPower").getAsInt(),
                obj.get("Defence").getAsInt(),
                obj.get("Score").getAsInt(),
                obj.get("CollectingSpeed").getAsFloat(),
                obj.get("Name").getAsString(),
                context.deserialize(obj.get("UpgradeLevels").getAsJsonArray(), int[].class)
        );
    }
}

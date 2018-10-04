////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.deserializer;

import com.google.gson.*;
import io.polyhx.lhgames.game.GameInfo;
import io.polyhx.lhgames.game.Player;
import io.polyhx.lhgames.game.point.Point;

import java.lang.reflect.Type;

public class GameInfoDeserializer implements JsonDeserializer<GameInfo> {
    @Override
    public GameInfo deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();

        Point relative = new Point(
                obj.get("xMin").getAsInt(),
                obj.get("yMin").getAsInt()
        );

        return new GameInfo(
                new PlayerDeserializer().deserialize(obj.get("Player"), Player.class, context),
                new MapDeserializer().deserialize(obj.get("CustomSerializedMap").getAsString(), relative)
        );
    }
}

////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.deserializer;

import com.google.gson.*;
import io.polyhx.lhgames.game.Point;

import java.lang.reflect.Type;

public class PointDeserializer implements JsonDeserializer<Point> {
    @Override
    public Point deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject obj = json.getAsJsonObject();
        return new Point(
                obj.get("x").getAsInt(),
                obj.get("y").getAsInt()
        );
    }
}

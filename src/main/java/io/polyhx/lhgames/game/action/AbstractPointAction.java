////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.Point;

public abstract class AbstractPointAction implements IAction {
    private final Point fPoint;

    public AbstractPointAction(Point point) {
        fPoint = point;
    }

    @Override
    public String getJSONContent() {
        return fPoint.toJSON();
    }
}

////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.Point;

public abstract class AbstractPointAction implements IAction {
    private final Point fPoint;

    public AbstractPointAction(Point point) {
        /* get the direction for each coordinate */
        int x = point.getX()/Math.abs(point.getX());
        int y = point.getY()/Math.abs(point.getY());

        /* the point can only be in one direction */
        fPoint = (Math.abs(x) + Math.abs(y) == 2) ? new Point() : new Point(x, y);
    }

    @Override
    public String getJSONContent() {
        return fPoint.toJSON();
    }
}

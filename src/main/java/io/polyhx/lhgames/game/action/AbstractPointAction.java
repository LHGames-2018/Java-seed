////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game.action;

import io.polyhx.lhgames.game.point.IPoint;
import io.polyhx.lhgames.game.point.Point;

public abstract class AbstractPointAction implements IAction {
    private final IPoint fPoint;

    public AbstractPointAction(IPoint point) {
        /* get the direction for each coordinate */
        int x = (point.getX() != 0) ? point.getX()/Math.abs(point.getX()) : 0;
        int y = (point.getY() != 0) ? point.getY()/Math.abs(point.getY()) : 0;

        /* the point can only be in one direction */
        fPoint = (Math.abs(x) + Math.abs(y) == 2) ? new Point() : new Point(x, y);
    }

    @Override
    public String getJSONContent() {
        return fPoint.toJSON();
    }
}

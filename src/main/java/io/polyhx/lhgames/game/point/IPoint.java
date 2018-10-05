package io.polyhx.lhgames.game.point;

public interface IPoint {
    int getX();

    int getY();

    default double getDistanceTo(IPoint point) {
        double dx = getX() - point.getX();
        double dy = getY() - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    default String toJSON() {
        return String.format("{X:%d,Y:%d}", getX(), getY());
    }
}

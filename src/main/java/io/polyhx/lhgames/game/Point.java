package io.polyhx.lhgames.game;

public class Point {
    private final int fX;
    private final int fY;

    public Point() {
        fX = 0;
        fY = 0;
    }

    public Point(int x, int y) {
        fX = x;
        fY = y;
    }

    public static final Point UP = new Point(0, -1);

    public static final Point DOWN = new Point(0, 1);

    public static final Point LEFT = new Point(-1, 0);

    public static final Point RIGHT = new Point(1, 0);

    public int getX() {
        return fX;
    }

    public int getY() {
        return fY;
    }

    public String toJSON() {
        return String.format("{X:%d,Y:%d}", fX, fY);
    }
}

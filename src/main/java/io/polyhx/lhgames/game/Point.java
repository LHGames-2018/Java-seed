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

    public int getX() {
        return fX;
    }

    public int getY() {
        return fY;
    }
}

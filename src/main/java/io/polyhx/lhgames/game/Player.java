package io.polyhx.lhgames.game;

public class Player {
    private final Point fPosition;
    private final Point fHouse;
    private final int fHealthCurrent;
    private final int fHealthMax;
    private final int fResourceCurrent;
    private final int fResourceCapacity;
    private final int fResourceTotal;
    private final int fAttack;
    private final int fDefence;
    private final int fScore;
    private final float fCollectingSpeed;
    private final String fName;

    /* TODO: add items and upgrades */

    public Player(Point pos, Point house, int healthCurrent, int healthMax, int resourceCurrent, int resourceCapacity,
                  int resourceTotal, int attack, int defence, int score, float collectingSpeed, String name) {
        fPosition = pos;
        fHouse = house;
        fHealthCurrent = healthCurrent;
        fHealthMax = healthMax;
        fResourceCurrent = resourceCurrent;
        fResourceCapacity = resourceCapacity;
        fResourceTotal = resourceTotal;
        fAttack = attack;
        fDefence = defence;
        fScore = score;
        fCollectingSpeed = collectingSpeed;
        fName = name;
    }

    public Point getPosition() {
        return fPosition;
    }

    public Point getHousePosition() {
        return fHouse;
    }

    public int getCurrentHealth() {
        return fHealthCurrent;
    }

    public int getMaximumHealth() {
        return fHealthMax;
    }

    public int getCarriedResource() {
        return fResourceCurrent;
    }

    public int getResourceCapacity() {
        return fResourceCapacity;
    }

    public int getTotalResource() {
        return fResourceTotal;
    }

    public int getAttack() {
        return fAttack;
    }

    public int getDefence() {
        return fDefence;
    }

    public int getScore() {
        return fScore;
    }

    public float getCollectingSpeed() {
        return fCollectingSpeed;
    }

    public String getName() {
        return fName;
    }
}

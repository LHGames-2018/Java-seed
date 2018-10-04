////////////////////////////////////////////
//         DO NOT TOUCH THIS FILE         //
////////////////////////////////////////////

package io.polyhx.lhgames.game;

import io.polyhx.lhgames.game.point.IPoint;
import io.polyhx.lhgames.game.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPoint {
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
    private final Upgrades fUpgrades;
    private final List<Item> fItems;

    /* TODO: add items */

    public Player(Point pos, Point house, int healthCurrent, int healthMax, int resourceCurrent, int resourceCapacity,
                  int resourceTotal, int attack, int defence, int score, float collectingSpeed, String name,
                  int[] upgrades, int[] items) {
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

        /* make sure we have an upgrade array */
        if(upgrades == null) {
            upgrades = new int[]{0,0,0,0,0};
        }

        /* make the array of lenth 5 if it isn't for some reason */
        if(upgrades.length < 5) {
            System.out.println("Upgrade array has less than 5 elements: " + upgrades);
            int[] newUpgrades = new int[]{0,0,0,0,0};
            for(int i = 0; i < newUpgrades.length; i++) {
                newUpgrades[i] = (i < upgrades.length) ? upgrades[i] : 0;
            }
        }

        /* warning if the array is of a size higher than 5 */
        if(upgrades.length > 5) {
            System.out.println("Upgrade array has more than 5 elements: " + upgrades);
        }

        /* create the upgrades */
        fUpgrades = new Upgrades(
                upgrades[Upgrade.CARRYING_CAPACITY.getID()],
                upgrades[Upgrade.MAXIMUM_HEALTH.getID()],
                upgrades[Upgrade.COLLECTING_SPEED.getID()],
                upgrades[Upgrade.ATTACK.getID()],
                upgrades[Upgrade.DEFENCE.getID()]
        );

        /* create the items */
        fItems = new ArrayList<>();
        for(int item : items) {
            fItems.add(Item.fromID(item));
        }
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

    @Override
    public int getX() {
        return fPosition.getX();
    }

    @Override
    public int getY() {
        return fPosition.getY();
    }

    class Upgrades {
        final int fCarryingCapacity;
        final int fMaximumHealth;
        final int fCollectingSpeed;
        final int fAttack;
        final int fDefence;

        Upgrades(int capacity, int health, int speed, int attack, int defence) {
            fCarryingCapacity = capacity;
            fMaximumHealth = health;
            fCollectingSpeed = speed;
            fAttack = attack;
            fDefence = defence;
        }
    }

    public int getCapacityLevel() {
        return fUpgrades.fCarryingCapacity;
    }

    public int getHealthLevel() {
        return fUpgrades.fMaximumHealth;
    }

    public int getCollectingSpeedLevel() {
        return fUpgrades.fCollectingSpeed;
    }

    public int getAttackLevel() {
        return fUpgrades.fAttack;
    }

    public int getDefenceLevel() {
        return fUpgrades.fDefence;
    }

    public List<Item> getItems() {
        return fItems;
    }
}

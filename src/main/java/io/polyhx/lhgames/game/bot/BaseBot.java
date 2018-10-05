package io.polyhx.lhgames.game.bot;

import io.polyhx.lhgames.game.Item;
import io.polyhx.lhgames.game.Upgrade;
import io.polyhx.lhgames.game.action.*;
import io.polyhx.lhgames.game.point.IPoint;

public class BaseBot {
    static StealAction createStealAction(IPoint point) {
        return new StealAction(point);
    }

    static MeleeAttackAction createMeleeAttackAction(IPoint point) {
        return new MeleeAttackAction(point);
    }

    static CollectAction createCollectAction(IPoint point) {
        return new CollectAction(point);
    }

    static MoveAction createMoveAction(IPoint point) {
        return new MoveAction(point);
    }

    static UpgradeAction createUpgradeAction(Upgrade upgrade) {
        return new UpgradeAction(upgrade);
    }

    static PurchaseAction createPurchaseAction(Item item) {
        return new PurchaseAction(item);
    }

    static HealAction createHealAction() {
        return new HealAction();
    }
}

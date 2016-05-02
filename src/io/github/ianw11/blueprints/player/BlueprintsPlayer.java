package io.github.ianw11.blueprints.player;

import io.github.ianw11.gamebase.io.InputMethod;
import io.github.ianw11.gamebase.turn.Player;
import io.github.ianw11.gamebase.turn.TurnAction;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BlueprintsPlayer extends Player {

   public BlueprintsPlayer(final int id, final String name, final InputMethod inputMethod) {
      super(id, name, inputMethod);
   }

   @Override
   protected TurnAction getInitialTurnAction() {
      throw new NotImplementedException();
   }

}

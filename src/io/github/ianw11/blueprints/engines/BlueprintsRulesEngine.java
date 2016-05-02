package io.github.ianw11.blueprints.engines;

import java.util.List;

import io.github.ianw11.gamebase.engine.BaseRulesEngine;
import io.github.ianw11.gamebase.turn.Player;
import io.github.ianw11.gamebase.turn.Turn;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BlueprintsRulesEngine extends BaseRulesEngine {
   
   private static final int MIN_PLAYERS = 2;
   private static final int MAX_PLAYERS = 4;
   
   

   public BlueprintsRulesEngine(List<Player> players) {
      super(players);
      
      //initializeGame();
   }
   
   

   @Override
   protected boolean processTurn(Turn currentTurn) {
      throw new NotImplementedException();
   }

   @Override
   public boolean isGameOver() {
      throw new NotImplementedException();
   }

   @Override
   protected int getMinNumberOfPlayers() {
      return MIN_PLAYERS;
   }

   @Override
   protected int getMaxNumberOfPlayers() {
      return MAX_PLAYERS;
   }



   @Override
   protected void preGameInit() {
      System.out.println("preGameInit");
   }



   @Override
   protected void preRound() {
      System.out.println("preRound");
   }



   @Override
   protected void postRound() {
      System.out.println("postRound");
   }
  
   
   
}

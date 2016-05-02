package io.github.ianw11.blueprints.test;

import java.util.ArrayList;
import java.util.List;

import io.github.ianw11.blueprints.engines.BlueprintsRulesEngine;
import io.github.ianw11.blueprints.io.KeyboardInputMethod;
import io.github.ianw11.blueprints.player.BlueprintsPlayer;
import io.github.ianw11.gamebase.engine.BaseRulesEngine;
import io.github.ianw11.gamebase.io.InputMethod;
import io.github.ianw11.gamebase.turn.Player;

public class CommandLineTestDriver {

   private static final InputMethod commandLineInputMethod = new KeyboardInputMethod(); 
   private static final List<Player> players = new ArrayList<Player>() {{
      add(new BlueprintsPlayer(0, "Ian", commandLineInputMethod));
      add(new BlueprintsPlayer(1, "Ryan", commandLineInputMethod));
   }};
   private static final BaseRulesEngine mRulesEngine = new BlueprintsRulesEngine(players);

   public static void main(String[] args) {
      System.out.println("COMMAND LINE TEST DRIVER");
      
      mRulesEngine.runGame();
      
      System.out.println("Bye!");
   }
   
}

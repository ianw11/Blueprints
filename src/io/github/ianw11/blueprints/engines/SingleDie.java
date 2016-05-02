package io.github.ianw11.blueprints.engines;

import io.github.ianw11.gamebase.pieces.NSidedDie;

public class SingleDie extends NSidedDie {
   
   /**
    * The different colors of dice
    */
   public enum Color {
      WOOD, // Orange
      RECYCLED, // Green
      STONE, // Black
      GLASS; // Transparent
   }
   
   public enum Faces {
      TOP, // Towards the sky. Relevant for glass
      FRONT, // Towards the player
      RIGHT, // Facing the player's right
      BACK, // Facing the center of the "table"
      LEFT, // Facing the player's left
      BOTTOM; // Facing down to the table/die under
   }
   private static final Faces[] FACES = Faces.values();
   private static final int NUM_FACES = FACES.length;
   private final SingleDie[] adjacentDice = new SingleDie[NUM_FACES];
   
   public SingleDie() {
      super(NUM_FACES);
   }
   
   
}

package io.github.ianw11.blueprints.io;

import java.util.Scanner;

import io.github.ianw11.gamebase.io.InputMethod;

public class KeyboardInputMethod extends InputMethod {
   
   private final Scanner mScanner;
   
   public KeyboardInputMethod() {
      mScanner = new Scanner(System.in);
   }

   @Override
   public int nextInt() {
      return Integer.parseInt(mScanner.next());
   }

}

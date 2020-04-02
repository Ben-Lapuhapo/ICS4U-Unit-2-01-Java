/*************************************
 * Created by: Ben Lapuhapo
 * Created on: APRIL 1 2020
 * This program uses the class Stack, and pushes three numbers to it
 **************************************/

public class MrCoxallStack {
  /************************************
  * This program creates a stack.
  ***********************************/
  public static void main(String[] args) {
    // Instantiates stack
    Stack stack = new Stack();

    // Push 3 numbers
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.toString());
  }
}
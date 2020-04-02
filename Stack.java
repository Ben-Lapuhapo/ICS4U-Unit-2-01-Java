/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: April 1 2019
 * This program creates a stack and pushes three numbers to it
 * 
 ****************************************************************************/

import java.util.ArrayList;

public class Stack {
    private static final ArrayList<Integer> myStack = new ArrayList<Integer>();

    // Adds integers onto the stack
    public void push(int number)
    {
        myStack.add(number);
    }

    // Converts stack into string
    public String toString()
    {
        String output = "";

        for (Integer count : myStack)
        {
            output += count + "\n";
        }

        return output.toString();
    }

}

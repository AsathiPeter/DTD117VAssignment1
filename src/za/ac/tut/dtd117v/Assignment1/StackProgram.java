package za.ac.tut.dtd117v.Assignment1;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.lang.Integer;
import java.util.LinkedList;

public class StackProgram {
    public static <NumsQueue> void main(String[]Args){
        //Question 1
        Stack<Integer> Numbers = new Stack<Integer>();

        //Adding Numbers 55, 46, 90, 39, 20, 13,
        //56, 100, 20 and 77
        System.out.println("Question 1");
        Numbers.push(55);
        System.out.println("value 55 added into stack Numbers");
        Numbers.push(46);
        System.out.println("value 46 added into stack Numbers");
        Numbers.push(90);
        System.out.println("value 90 added into stack Numbers");
        Numbers.push(39);
        System.out.println("value 39 added into stack Numbers");
        Numbers.push(20);
        System.out.println("value 20 added into stack Numbers");
        Numbers.push(13);
        System.out.println("value 13 added into stack Numbers");
        Numbers.push(56);
        System.out.println("value 56 added into stack Numbers");
        Numbers.push(100);
        System.out.println("value 100 added into stack Numbers");
        Numbers.push(20);
        System.out.println("value 20 added into stack Numbers");
        Numbers.push(77);
        System.out.println("value 77 added into stack Numbers");


    //separating question 1 and question 2

        System.out.println("");

        System.out.println("Question 2");
        System.out.println(Numbers);
        System.out.println("");

        System.out.println("Question 3");
        Stack<Integer> Temp = new Stack<Integer>();
        Temp.push(Numbers.pop());
        System.out.println("moving 77 from Numbers to Temp stacks");
        Temp.push(Numbers.pop());
        System.out.println("moving 20 from Numbers to Temp stacks");
        Temp.push(Numbers.pop());
        System.out.println("moving 100 from Numbers to Temp stacks");
        Temp.push(Numbers.pop());
        System.out.println("moving 56 from Numbers to Temp stacks");
        Temp.push(Numbers.pop());
        System.out.println("moving 13 from Numbers to Temp stacks");
        Temp.push(Numbers.pop());
        System.out.println("moving 20 from Numbers to Temp stacks");
        //Delete value 39
        Numbers.pop();
        System.out.println("Value 39 is deleted from Numbers stack");

        //Restoring the values back to Numbers stack
        Numbers.push(Temp.pop());
        System.out.println("Restoring 20 from Temp to Numbers stacks");
        Numbers.push(Temp.pop());
        System.out.println("Restoring 13 from Temp to Numbers stacks");
        Numbers.push(Temp.pop());
        System.out.println("Restoring 56 from Temp to Numbers stacks");
        Numbers.push(Temp.pop());
        System.out.println("Restoring 100 from Temp to Numbers stacks");
        Numbers.push(Temp.pop());
        System.out.println("Restoring 20 from Temp to Numbers stacks");
        Numbers.push(Temp.pop());
        System.out.println("Restoring 77 from Temp to Numbers stacks");
        System.out.println(Numbers);
        System.out.println("");


        System.out.println("Question 4");
        System.out.println("");


        //Question 5
        System.out.println("Question 5");
        // Using setElementAt() method to replace 46 with 13
        Numbers.setElementAt(13, 1);
        System.out.println("46 replaced with 13");
        // Using setElementAt() method to replace 13 with 46
        Numbers.setElementAt(46, 4);
        System.out.println("13 replaced with 46");
        System.out.println("");
        System.out.println("Question 6");
        //Displaying the values in Numbers Stack
        System.out.println(Numbers);
        System.out.println("");


//Displaying the top element on Numbers Stack
        System.out.println("Question 7");
        System.out.println(Numbers.peek());
        System.out.println("");


//Displaying the size of Numbers stack
        System.out.println("Question 8");
        System.out.println(Numbers.size());
        System.out.println("");

        //Question 9
        System.out.println("Question 9");
        //Creating a Queue instance
        Queue NumsQueue = new LinkedList();

        //Removing top 4 values from Numbers Stack in order
        Numbers.remove(8);
        Numbers.remove(7);
        Numbers.remove(6);
        Numbers.remove(5);

        //Adding top 4 values from Numbers Stack to NumsQueue
        NumsQueue.add(77);
        NumsQueue.add(20);
        NumsQueue.add(100);
        NumsQueue.add(56);
        System.out.println("");


        //Question 10
        System.out.println("Question 10");
        System.out.println(NumsQueue);
        System.out.println("");
        //Question 11
        System.out.println("Question 11");
        System.out.println(NumsQueue.size());
        System.out.println("");

        //to be deleted
        System.out.println(Numbers);



            
        }
          
        



    }


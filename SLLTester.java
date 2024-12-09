import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
//Drew Mendelow pd 7, 12/9/24
//asks user for numbers and sorts them in a Stack and then in a Queue

class SLLTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter whole number 1:");
    int num1 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 2:");
    int num2 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 3:");
    int num3 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 4:");
    int num4 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 5:");
    int num5 = input.nextInt();
    input.nextLine();
    
    Stack stack = new Stack();
    stack.push(num1);
    stack.push(num2);
    stack.push(num3);
    stack.push(num4);
    stack.push(num5);

    Stack temp = new Stack();
    while (!stack.isEmpty()){
      temp.push(stack.pop());
    }//end while

    while (!temp.isEmpty()){
      int tempInt = (int)temp.pop();
      stack.push(tempInt);
      stack.push(tempInt);
    }//end while

    System.out.println("Doubled Stack:");
    Iterator iterator = stack.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }//end while

    System.out.println("Enter another whole number 1:");
    int q1 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 2:");
    int q2 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 3:");
    int q3 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 4:");
    int q4 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 5:");
    int q5 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 6:");
    int q6 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 7:");
    int q7 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 8:");
    int q8 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 9:");
    int q9 = input.nextInt();
    input.nextLine();

    System.out.println("Enter whole number 10:");
    int q10 = input.nextInt();
    input.nextLine();

    Queue q = new LinkedList<Integer>();
    q.add(q1);
    q.add(q2);
    q.add(q3);
    q.add(q4);
    q.add(q5);
    q.add(q6);
    q.add(q7);
    q.add(q8);
    q.add(q9);
    q.add(q10);

    Queue qEven = new LinkedList<Integer>();
    Queue qOdd = new LinkedList<Integer>();
    while (!q.isEmpty()){
      int val = (int) q.remove();
      if (val % 2 == 0){
        qEven.add(val);
      }//end if
      else{
        qOdd.add(val);
      }//end else
    }//end while

    while(!qEven.isEmpty()){
      q.add(qEven.remove());
    }//end while

    while(!qOdd.isEmpty()){
      q.add(qOdd.remove());
    }//end while

    System.out.println("Sorted queue:");
    while(!q.isEmpty()){
      System.out.println(q.remove());
    }//end while
  } // end main
} // end class
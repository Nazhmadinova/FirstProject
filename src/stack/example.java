package stack;

import java.util.Stack;

public class example {

// Object push(Object element) : Pushes an element on the top of the stack.

//Object pop() : Removes and returns the top element of the stack.
// An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.

//Object peek() : Returns the element on the top of the stack, but does not remove it.

//boolean empty() : It returns true if nothing is on the top of the stack. Else, returns false.

//int search(Object element) : It determines whether an object exists in the stack.
// If the element is found, it returns the position of the element from the top of the stack.
// Else, it returns -1.

    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop :");

        for(int i = 0; i < 3; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }


    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack);
        stack_push(stack);
        System.out.println(stack);
        stack_pop(stack);
        System.out.println(stack);
        stack_push(stack);
        System.out.println(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
        stack_search(stack, 4);
    }

}

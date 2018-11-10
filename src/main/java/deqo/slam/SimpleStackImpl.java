package deqo.slam;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimleStack{


    Stack<Object> stack=new Stack<Object>();

    public SimpleStackImpl() {

    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
        /**
         * Returns the number of items in this stack.
         */
        public int getSize(){
            return stack.size();
        }
        /**
         * Pushes an item onto the top of this stack.
         * null item is allowed.
         */
        public void push(Item item){
                stack.push(item);
        }
        /**
         * Looks at the object at the top of this stack without removing it from the stack.
         */
        public Item peek() throws EmptyStackException{
            return (Item)stack.peek();

        }
        /**
         * Removes the object at the top of this stack and returns that object as the value of this function.
         * @throws EmptyStackException if this stack is empty.
         */
        public Item pop() throws EmptyStackException{
            return (Item)stack.pop();
        }




}

import java.util.Stack;
public class Implement_Queue_Using_Stacks{
        private Stack<Integer> in_stack;
        private Stack<Integer> out_stack;

        public Implement_Queue_Using_Stacks(){
            in_stack = new Stack<>();
            out_stack = new Stack<>();
        }

        private void transfer(){
            while(!in_stack.isEmpty()){
                out_stack.push(in_stack.pop());
            }
        }

        public void push(int x){
            in_stack.push(x);
        }

        public int pop(){
            if(out_stack.isEmpty()){
                transfer();
            }
            return out_stack.pop();
        }

        public int peek(){
            if(out_stack.isEmpty()){
                transfer();
            }
            return out_stack.peek();
        }

        public boolean empty(){
            return in_stack.isEmpty() && out_stack.isEmpty();
        }

        public static void main(String[] args){
        Implement_Queue_Using_Stacks queue = new Implement_Queue_Using_Stacks();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.peek()); // Should print 1
        System.out.println(queue.pop());  // Should print 1
        System.out.println(queue.empty()); // Should print false

        queue.push(4);
        System.out.println(queue.pop());  // Should print 2
        System.out.println(queue.peek()); // Should print 3
        System.out.println(queue.empty()); // Should print false
        }
}
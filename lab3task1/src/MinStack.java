import java.util.Stack;
public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        mainStack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek())
        {
            minStack.push(value);
        }
    }

    public void pop() {
        if (mainStack.isEmpty())
        {
            throw new IllegalStateException("Stack is empty");
        }

        int poppedValue = mainStack.pop();

        if (poppedValue == minStack.peek())
        {
            minStack.pop();
        }
    }


    public int min() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return minStack.peek();
    }
}

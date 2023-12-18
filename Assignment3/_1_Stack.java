import java.util.*;

class stack {
    int maxSize;
    int top;
    int stackList[];

    stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stackList = new int[maxSize];
    }

    void push(int num) {
        if (top < maxSize - 1) {
            stackList[++top] = num;
        } else {
            System.out.println("Stack overflow");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int pop = stackList[top--];
            return pop;
        }
    }

    void display() {
        int temp = top;
        while (temp > -1) {
            System.out.print(stackList[temp] + "\t");
            temp--;
        }
    }
}

public class _1_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = sc.nextInt();

        stack myStack = new stack(maxSize);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to push onto the stack: ");
                    int numToPush = sc.nextInt();
                    myStack.push(numToPush);
                    break;

                case 2:
                    int poppedElement = myStack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;

                case 3:
                    System.out.println("\nStack elements: ");
                    myStack.display();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}

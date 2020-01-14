import java.util.Scanner;
import java.util.Stack;

public class RevertStack {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of stack - array: ");
        int size = scanner.nextInt();
        Integer[] arr = new Integer[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("please enter data " + i + " in stack:");
            int data = scanner.nextInt();
            stack.push(data);

        }
        System.out.println("Your stack: " + stack);
        for (int i = 0 ; i < size  ; i++) {
                 arr[i] = (Integer) stack.pop();
        }
        System.out.println("Your array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------");
        String string;
        System.out.println("Enter String you want insert: ");
        scanner.nextLine();
        string = scanner.nextLine();
        for (int i = 0; i < size ; i++) {
           stack.push(arr[i]+string);
        }
        System.out.println(stack);

    }
}

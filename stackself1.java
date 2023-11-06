import java.util.Stack;

public class stackself1 {
    public static void  main(String[] args){

        Stack<String> stack = new Stack<String>();

        stack.push("NORVIN");
        stack.push("DAISY");
        stack.push("SAMSON");
        stack.push("DOMINIC");
        stack.push("CHRIS");
        stack.push("DERRICK");

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();

        System.out.println(stack.search("BASIA"));

        System.out.println(stack.peek());

        System.out.println(stack);
    }
}
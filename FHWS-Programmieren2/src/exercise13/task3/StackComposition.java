package exercise13.task3;

import java.util.ArrayList;

public class StackComposition implements InterfaceStack
{
    ArrayList<Object> arrayList = new ArrayList<>();

    @Override
    public void push(Object element)
    {
        arrayList.add(element);
    }

    @Override
    public Object pop()
    {
        Object element = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return element;
    }

    public static void main(String[] args)
    {
        StackComposition stack = new StackComposition();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // c) AbstractClass vs Interface
        // AbstractClass sinnvoll wenn Methoden ausprogrammiert sein sollen
        // Interface sinnvoll wenn Methoden individuell sein sollen
        // Interface notwendig bei mehrfachvererbung
    }
}
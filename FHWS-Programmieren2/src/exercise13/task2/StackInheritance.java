package exercise13.task2;

import exercise13.task3.InterfaceStack;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> implements InterfaceStack
{
    private static final long serialVersionUID = 1L;

    @Override
    public void push(Object element)
    {
        this.add(element);
    }

    @Override
    public Object pop()
    {
        Object element = this.get(this.size() - 1);
        this.remove(this.size() - 1);
        return element;
    }

    public static void main(String[] args)
    {
        StackInheritance stack = new StackInheritance();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // b) Nachteil:
        // Stack bekommt alle Attribute und Methoden von ArrayList vererbt
        // Nicht alle Attribute und Methoden werden verwendet
    }
}
package exercise15.task3;


import javax.xml.bind.ValidationException;

public class Person
{
    public String prename;
    public String surname;
    public PersonAddress address;

    public Person(String prename, String surname, int zipCode, String city, String street, String houseNumber)
    {
        try
        {
            this.prename = checkUpperCase(prename);
            this.surname = checkUpperCase(surname);
            address = new PersonAddress(zipCode, city, checkUpperCase(street), checkNumber(houseNumber));
            System.out.println("Person was created");
        } catch (ValidationException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String checkUpperCase(String string) throws ValidationException
    {
        if (Character.isUpperCase(string.charAt(0)))
        {
            return string;
        } else
        {
            throw new ValidationException(string + " has to start with an upper case");
        }
    }

    public String checkNumber(String string) throws ValidationException
    {
        if (Character.isDigit(string.charAt(0)))
        {
            return string;
        } else
        {
            throw new ValidationException(string + " has to start with an digit");
        }
    }

    public static void main(String[] ags)
    {
        new Person("Max", "Mustermann", 80333, "München", "Müllergasse", "33");
        new Person("max", "mustermann", 80333, "münchen", "müllergasse", "33");
        new Person("Max", "Mustermann", 80333, "München", "Müllergasse", "a3");
    }
}
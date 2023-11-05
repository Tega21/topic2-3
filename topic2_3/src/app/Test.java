// Brandon Ortega// CST-239// 11.05.2023// Code used from activity 2 example
package app;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Johnny", "Ortega");
        Person person2 = new Person("Luke", "Ortega");
        Person person3 = new Person(person1);

        // Testing object equality
        if(person1 == person2){
            System.out.println("Both person objects are identical using ==");
        } else{
            System.out.println("Persons are not identical using ==");
        }

        if(person1.equals(person2)){
            System.out.println("Persons are identical using equals()");
        } else{
            System.out.println("These persons are not identical using equals()");
        }
        // Testing copy constructor
        if(person1.equals(person3)){
            System.out.println("Copied person is identical using equals()");
        } else{
            System.out.println("Copied person is not identical using equals()");
        }

        // Output
        System.out.println(person1);
        System.out.println(person2.toString());
        System.out.println(person3);

    }
}

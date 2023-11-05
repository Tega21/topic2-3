// Brandon Ortega// CST-239// 11.05.2023// I used code given to us by example in activity 2
package app;

/**
 * This class represents a person with a first name and a last name.
 */

public class Person {

    private String firstName = "Brandon";
    private String lastName = "Ortega";
    
    /**
     * Constructs new Person with the specified first and last name
     * @param firstName Person's first name
     * @param lastName Person's last name
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * Constructs a new person by copying the names from another person.
     *
     * @param person The person to copy data from.
     */
    public Person(Person person){
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
    }
    
    /**
     * Retrieves the first name of the person.
     *
     * @return A string representing the person's first name.
     */
    public String getFirstName(){
        return firstName;
    }
    
    /**
    * Retrieves the last name of the person.
    *
    * @return A string representing the person's last name.
    */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * @param other The reference object with which to compare.
     * @return {@code true} if this object is the same as the other argument; {@code false} otherwise.
     */
    public boolean equals(Object other) {
    	if(other == this) {
    		System.out.println("I am here in other == this");
    		return true;
    	}
    	if (other == null) {
    		System.out.println("I am here in other == null");
    		return false;
    	}
    	if(getClass() != other.getClass()) {
    		System.out.println("I am here in getClass() != other.getClass()");
    		return false;    		
    	}
    	Person person = (Person) other;
    	return (this.firstName == person.firstName && this.lastName == person.lastName);
    }
    
    /**
     * Returns a string representation of the person, including the class name and the person's names.
     *
     * @return A string representation of the person's information.
     */
    public String toString() {
    	return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
    }
    

}

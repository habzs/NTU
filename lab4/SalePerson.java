public class SalePerson implements Comparable<Object> {
    private String firstName;
    private String lastName;
    private int totalSales;

    //constructor
    public SalePerson(String firstName, String lastName, int sales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = sales;
    }

    public int getTotalSales() {
        return this.totalSales;    
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String toString() {
        return this.lastName + " , " + this.firstName + " : " + this.totalSales;
    }

    public boolean equals(Object o) {
        // check if first and last names of Object are the same as the current sale person.

        
    }
 
    
}

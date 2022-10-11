/**
 * SalePerson
 */
public class SalePerson implements Comparable<Object> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSale;
    }

    public String toString() {
        return this.firstName + ", " + this.lastName + ": " + this.totalSales;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }

    public boolean equals(Object o) {
        if (o instanceof SalePerson) /* instanceof: check if o is the same object type as SalePerson */ {
            SalePerson newPerson = (SalePerson) o;

            if (this.firstName == newPerson.getFirstName() && this.lastName == newPerson.getLastName()) {
                return true;
            }
        }

        return false; // either not the same object type or not the same person, return false.
    }

    public int compareTo(Object o) {
        // make comparison based on total sales.
        // return -ve if executing object has total sales LESS than the other object.
        // return +ve if executing object sales GREATER than other object.

        if (o instanceof SalePerson) {
            SalePerson newPerson = (SalePerson) o;

            if (this.totalSales > newPerson.getTotalSales()) {
                return 1;
            } else if (this.totalSales < newPerson.getTotalSales()) {
                return -1;
            }

            if (this.totalSales == newPerson.totalSales) {
                return this.lastName.compareTo(newPerson.getLastName());
            }
        }

        return -1;

    }
}
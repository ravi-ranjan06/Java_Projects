package hello;

public class Employee {
    private long id;
    private String firstName, lastName;

    public Employee(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    // getters & setters omitted for brevity
}


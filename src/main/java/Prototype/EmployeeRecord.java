package Prototype;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(int id, String name, String designation, double salary, String address){

        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }


    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}

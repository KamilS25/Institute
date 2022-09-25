package ru.mirea.PR3.Format;

public class Employee {
    private String fullname = "Surname Name";
    private double salary = 0;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    @Override
    public String toString() {
        return "Fullname: " + fullname + ", salary: " + salary;
    }
}

class Report {
    public Report(Employee[] arr) {

    }

     static void generateReport(Employee[] Arr) {
        System.out.println("Report:");
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
}

class Test {

    public static void main(String[] args) {

        Employee first = new Employee("Nil Armstrong", 121250);
        Employee second = new Employee("Jack Dwayne", 4541);
        Employee third = new Employee("Pol Walker", 45632145);

        Employee[] arr = new Employee[3];
        arr[0] = first;
        arr[1] = second;
        arr[2] = third;

        Report report = new Report(arr);
        report.generateReport(arr);

    }

}


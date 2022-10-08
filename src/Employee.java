public class Employee {

    private final String name;

    private int department;

    private int salary;

    public static int count = 0;

    private int id;

    public Employee(String name, int department, int salary) {
        this.name = name;

        this.department = department;

        this.salary = salary;

        this.id = 1 + count++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;

    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


@Override
    public String toString() {
return id + ". " + name + ", " + department + ", " + salary;
    }




}

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int size) {
        this.employees = new Employee[size];
    }

    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public int expenses() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public int minSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }

        }
        return min;
    }

    public int maxSalary() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }

        }
        return max;

    }

    public double averageSalary() {
        double average = expenses() / Employee.getCount();
        return average;
    }

    public void printNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());

            }
        }
    }

    public void printIndexSalary() {
        double percent = 5;
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() + percent / 100 * employees[i].getSalary()));
            System.out.println(employees[i].toString());
        }

    }

    public Employee findEmpWithMinSalary(int department) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    j = i;
                }
            }
        }
        return employees[j];

    }

    public Employee findEmpWithMaxSalary(int department) {
        int max = Integer.MIN_VALUE;
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    k = i;
                }
            }
        }
        return employees[k];

    }

    public int sumSalaryDepartment(int department) {
        int sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumSalary = sumSalary + employees[i].getSalary();

            }

        }
        return sumSalary;
    }

    public double averageSumSalaryDepartment(int department) {
        double averageSumSalary = 0;
        int l = 0;
        double sumSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sumSalary = sumSalary + employees[i].getSalary();
                l = l + 1;
            }

            averageSumSalary = sumSalaryDepartment(department) / l;

        }
        return averageSumSalary;
    }

    public void indexSalary(int percent, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() / 100 * percent);
                System.out.println(employees[i]);
            }
        }
    }

    public void printNameSalaryDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].getId() + ". " + employees[i].getName() + ", " + employees[i].getSalary());
            }
        }

    }

    public void findEmpSalaryMoreThan(int salaryMoreThan) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > salaryMoreThan) {
                System.out.println(employees[i].getId() + ". " + employees[i].getName() + ", " + employees[i].getSalary());
            }

        }
    }

    public void findEmpSalaryLessThan(int salaryLessThan) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < salaryLessThan) {
                System.out.println(employees[i].getId() + ". " + employees[i].getName() + ", " + employees[i].getSalary());
            }

        }
    }

    public void addNewEmployee(String name, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee employee = new Employee(name, department, salary);
                employees[i] = employee;
                return;
            }

        }
    }

    public Employee[] removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName() == name) {
                employees[i] = null;
            }

        }
        return employees;

    }

    public Employee[] changeSalaryEmployee(String name, int newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                employees[i].setSalary(newSalary);
            }

        }
        return employees;
    }

    public Employee[] changeDepartmentEmployee(String name, int newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                employees[i].setDepartment(newDepartment);
            }

        }
        return employees;
    }

    private void printEmployeeAtDeprmnt(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println(employees[i].getName());
            }
        }
    }

    public void printEmployeesByDepartments() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("отдел №" + i);
            printEmployeeAtDeprmnt(i);

        }
    }


}

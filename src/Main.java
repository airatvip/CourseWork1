public class Main {
    public static void main(String[] args) {
        EmployeeBook rosneftBook = new EmployeeBook(6);
        rosneftBook.addNewEmployee("Громов Роман Витальевич", 5, 12000);
        rosneftBook.addNewEmployee("Тихонов Иван Серггевич", 4, 15000);
        rosneftBook.addNewEmployee("Попова Ирина Владимировна", 3, 13000);
        rosneftBook.addNewEmployee("Исаков Константин Анатольевич", 2, 20000);
        rosneftBook.addNewEmployee("Жданова Юлия Александровна", 1, 11000);
        rosneftBook.addNewEmployee("Маркина Виктория Петровна", 4, 120000);
        rosneftBook.printEmployeesByDepartments();




    }
}


//
//
//        Employee employees1 = new Employee("Громов Роман Витальевич", 2, 12000);
//        Employee employees2 = new Employee("Тихонов Иван Серггевич", 5, 15000);
//        Employee employees3 = new Employee("Попова Ирина Владимировна", 4, 13000);
//        Employee employees4 = new Employee("Исаков Константин Анатольевич", 5, 20000);
//        Employee employees5 = new Employee("Егоров Сергей Николаевич", 4, 18000);
//        Employee employees6 = new Employee("Жданова Юлия Александровна", 3, 11000);
//        Employee employees7 = new Employee("Шилов Артем Константинович", 2, 16000);
//        Employee employees8 = new Employee("Савина Дарья Геннадьевна", 3, 19000);
//        Employee employees9 = new Employee("Маркина Виктория Петровна", 1, 120000);
////        Employee employees10 = new Employee("Титова Татьяна Алексеевна", 1, 10000);








public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);
        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        headSales.children.add(new Employee("Wiroj", "Sales", 150000));
        headSales.children.add(new Employee("Weeranan", "Sales", 100000));
        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        headMarketing.children.add(new Employee("Oak", "Marketing", 200000));
        headMarketing.children.add(new Employee("Aem", "Marketing", 250000));

        ceo.children.add(headSales);
        ceo.children.add(headMarketing);

        printAllEmployee(ceo);
    }
    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
        System.out.println(ceo.children.get(0));
        System.out.println(ceo.children.get(0).children.get(0));
        System.out.println(ceo.children.get(0).children.get(1));
        System.out.println(ceo.children.get(1));
        System.out.println(ceo.children.get(1).children.get(0));
        System.out.println(ceo.children.get(1).children.get(1));
    }
}

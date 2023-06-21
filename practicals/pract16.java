import java.util.Scanner;

 class Employee {
    private String name;
    private int age;
    private String address;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter address: ");
        address = sc.nextLine();
        sc.close();
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getData();
        System.out.println("\n----------Employee Details----------\n");
        employee.showData();
    }
}

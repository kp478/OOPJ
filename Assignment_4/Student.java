public class Student {
    String name;
    int rollNo;
    String department;
    
    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Department: " + department);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("Anonymous", 20, "Computer Science");
        
        student1.displayInfo();
    }
}

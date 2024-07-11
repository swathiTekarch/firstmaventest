package Day1Assign;

import java.util.Scanner;
public class Student {
    private String name;
    private String university;
    private int id;
    private double gpa;

    // Constructor
    public Student (String name, int id, double gpa) {
        this.name = name;
        this.university = "tekarch";
        this.id = id;
        this.gpa = gpa;
    }
 // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline left from previous nextInt()

        // Array to store student objects
        Student[] students = new Student[numStudents];

        // Reading and storing student information
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
	
        scanner.nextLine(); // Consume newline left from previous nextDouble()

        students[i] = new Student(name, id, gpa);
    }

    // Read all student information by name
    System.out.println("\nEnter the name of the student to search: ");
    String searchName = scanner.nextLine();
    boolean found = false;
    for (Student student : students) {
        if (student.getName().equalsIgnoreCase(searchName)) {
            System.out.println("Student found:");
            System.out.println("Name: " + student.getName());
            System.out.println("University: " + student.getUniversity());
            System.out.println("ID: " + student.getId());
            System.out.println("GPA: " + student.getGpa());
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Student with name " + searchName + " not found.");
    }

    scanner.close();
}


	//****//
	


    System.out.print("Enter the number of students: "));
    int numStudents = scanner.nextInt();
    scanner.nextLine(); // Consume newline left from previous nextInt()


Student[] students = new Student[numStudents];

// Reading and storing student information
for (int i = 0; i < numStudents; i++) {
    System.out.println("\nEnter details for student " + (i + 1) + ":");
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("ID: ");
    int id = scanner.nextInt();
    System.out.print("GPA: ");
    double gpa = scanner.nextDouble();
    scanner.nextLine(); // Consume newline left from previous nextDouble()

    students[i] = new Student(name, id, gpa);
}
//Print all student information
printAllStudentInfo(students);

scanner.close();
}
}

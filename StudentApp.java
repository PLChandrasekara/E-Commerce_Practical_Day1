import java.util.Scanner;
class StudentApp{ 
    public static void main(String[] args) {
        // Creating individual student objects
        Student s1 = new Student("Alice", 85);
        Student s2 = new Student("Bob", 78);
        Student s3 = new Student("Charlie", 92);
        Student s4 = new Student("David", 88);
        Student s5 = new Student("Eve", 79);

        // Calculating total marks
        int totalMarks = s1.getMarks() + s2.getMarks() + s3.getMarks() + s4.getMarks() + s5.getMarks();
        
        // Calculating average marks
        double averageMarks = (double) totalMarks / 5;

        // Displaying the average
        System.out.println("Average Marks: " + averageMarks);
    }
}


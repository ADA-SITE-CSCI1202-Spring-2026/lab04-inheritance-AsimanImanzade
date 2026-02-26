package week06;

import java.util.Arrays;

class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Person[Name=" + firstName + " " + lastName + ", Gender=" + gender + "]";
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        return this.firstName.equals(p.firstName) && 
               this.lastName.equals(p.lastName) && 
               this.gender.equals(p.gender);
    }
}

class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender); 
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String[] getCourses() { return courses; }
    public void setCourses(String[] courses) { this.courses = courses; }

    @Override
    public String toString() {
        return "Teacher[" + super.toString() + ", Department=" + department + ", Courses=" + Arrays.toString(courses) + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) && 
               this.department.equals(t.department) && 
               Arrays.equals(this.courses, t.courses);
    }
}


class Student extends Person {
    private String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", StudentID=" + studentId + "]";
    }

    public boolean equals(Student s) {
        if (s == null) return false;
        return super.equals(s) && this.studentId.equals(s.studentId);
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Testing Person Class ---");
        Person p1 = new Person("Leo", "Messi", "Male");
        Person p2 = new Person("Cristiano", "Ronaldo", "Male");
        Person p3 = new Person("Neymar", "Junior", "Male");
        
        System.out.println(p1.toString());
        System.out.println("p1 equals p2? " + p1.equals(p2)); 
        System.out.println("p1 equals p3? " + p1.equals(p3)); 

        System.out.println("\n--- Testing Teacher Class ---");
        String[] courses1 = {"Java Programming", "Data Structures"};
        String[] courses2 = {"Java Programming", "Data Structures"};
        String[] courses3 = {"Web Development"};
        
        Teacher t1 = new Teacher("Azar", "Aliyev", "Male", "Computer Science", courses1);
        Teacher t2 = new Teacher("Azar", "Aliyev", "Male", "Computer Science", courses2);
        Teacher t3 = new Teacher("Mykhailo", "Medvediev", "Male", "Mathematics", courses3);
        
        System.out.println(t1.toString());
        System.out.println(t3.toString());
        System.out.println("t1 equals t2? " + t1.equals(t2)); 
        System.out.println("t1 equals t3? " + t1.equals(t3)); 

        System.out.println("\n--- Testing Student Class ---");
        Student s1 = new Student("Asiman", "Imanzade", "Male", "20434");
        Student s2 = new Student("Asiman", "Imanzade", "Male", "20434");
        Student s3 = new Student("Shamkhal", "Khalfayev", "Male", "20468");
        
        System.out.println(s1.toString());
        System.out.println(s3.toString());
        System.out.println("s1 equals s2? " + s1.equals(s2)); 
        System.out.println("s1 equals s3? " + s1.equals(s3)); 
    }
}
class Student implements Comparable<Student> {

    //Instance Variables
    private String name;
    private int age;
    private String studentNumber;

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setStudentNumber(String newStudentNumber) {
        this.studentNumber = newStudentNumber;
    }

    @Override
    public String toString() {
        return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
    }

    @Override
    public int compareTo(Student comparison) {
        return this.studentNumber.compareTo(comparison.getStudentNumber());
    }
}
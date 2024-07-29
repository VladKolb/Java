package theme7.task1;

public class Student extends Human {

    private int yearOfStudy;

    public Student(String name, int age, String sex, double weight, int yearOfStudy) {
        super(name, age, sex, weight);
        this.yearOfStudy = yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void increaseYearOfStudy() {
        this.yearOfStudy++;
    }
}

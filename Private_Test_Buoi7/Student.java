package Private_Test_Buoi7;

class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getCapacity() {
        if (score >= 9.0) {
            return "Hoc luc xuat sac";
        } else if (score >= 8.0 && score < 9.0) {
            return "Hoc luc gioi";
        } else if (score >= 6.5 && score < 8.0) {
            return "Hoc luc kha";
        } else {
            return "Hoc luc trung binh yeu";
        }
    }

    @Override
    public String toString() {
        return "Student{" + " id = " + getId() + ", name = ' " + getName() + '\'' + ", age = " + getAge() +
                ", address = " + getAddress() +
                ", score = " + score +
                ", capacity = ' " + getCapacity() + '\'' +
                '}';
    }
}

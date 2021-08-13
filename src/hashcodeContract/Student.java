package hashcodeContract;

import java.util.Objects;

public class Student {
    private int rollNumber;
    private String name;
    private String address;

    public Student() {
    }

    public Student(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false; // allow subclass as well
        Student student = (Student) o;
        return getRollNumber() == student.getRollNumber() && getName().equals(student.getName()) && getAddress().equals(student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNumber(), getName(), getAddress());
    }

    /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // it will not allow subclass
        Student student = (Student) o;
        return rollNumber == student.rollNumber &&
                name.equals(student.name) && address.equals(student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, address);
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && Objects.equals(name, student.name)
                && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, address);
    }*/
}

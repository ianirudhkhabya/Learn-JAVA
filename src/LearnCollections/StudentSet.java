package LearnCollections;

import java.util.Objects;

public class StudentSet implements Comparable<StudentSet> {

    String name;
    int rollNo;

    public StudentSet(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentSet{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentSet that)) return false;
        return rollNo == that.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(StudentSet that) {
        return this.rollNo - that.rollNo;
    }
}

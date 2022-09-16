package Generics_010.comparable;

public class Student implements Comparable<Student> {
	int rolleNumber;
	float marks;

	public Student(int rolleNumber, float marks) {
		this.rolleNumber = rolleNumber;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		return Float.compare(o.marks, this.marks);
	}
}

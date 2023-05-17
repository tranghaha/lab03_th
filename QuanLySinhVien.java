package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien {
	private ArrayList<Student> studentList;
	public QuanLySinhVien() {
		studentList =new ArrayList<>();
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	public void addStudent(Student student) {
		studentList.add(student);
	}
	public void xoaSinhVien( String studentID) {
		for (int i=0; i<studentList.size();i++) {
			Student student= studentList.get(i);
			if(student.getStudentID().equals(studentID)) {
				studentList.remove(i);
				break;
			}
		}
	}
	public void capNhatSinhVien(String studentID, String name, int birthyear) {
		for (Student student : studentList) {
			if (student.getStudentID().equals(studentID)) {
				student.setName(name);
				student.setBirthyear(birthyear);
				break;
			}
		}
	}
	public Student timtheoma(String studentID) {
		for (Student student : studentList) {
			if(student.getStudentID().equals(studentID)){
				return student;
			}
		}
		return null;
	}
	public Student timtheoten(String name) {
		for (Student student : studentList) {
			if(student.getName().equals(name)){
				return student;
			}
		}
		return null;
	}
	public void xuatdanhsach() {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	public void sapxepboiID() {
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare (Student student1, Student student2) {
				return student1.getStudentID().compareTo(student2.getStudentID());
			}
		});
	}
}
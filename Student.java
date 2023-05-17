package lab3;


	public class Student {
		private String studentID;
		private String name;
		private int birthyear;
		public Student(String studentID, String name, int birthyear) {
			super();
			this.studentID = studentID;
			this.name = name;
			this.birthyear = birthyear;
		}
		public String getStudentID() {
			return studentID;
		}
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBirthyear() {
			return birthyear;
		}
		public void setBirthyear(int birthyear) {
			this.birthyear = birthyear;
		}
		@Override
		public String toString() {
			return "Student [studentID=" + studentID + ", name=" + name + ", birthyear=" + birthyear + "]";
		}


	}
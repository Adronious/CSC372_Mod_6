import java.util.ArrayList;
//import java.util.Scanner;

public class StudentSorting {
	
	//ArrayList to hold each Student Object
	private static ArrayList<Student> arrayListStudent = new ArrayList<Student>();
	
	//Method to format and return Student Info legibly
	private static String displayStudentInfo(int studentIndex) {
		Student currStudent = arrayListStudent.get(studentIndex);
		String studentInfo = "Student#" + currStudent.getRollNum() + " is " + currStudent.getName()
							+ ". Living at: " + currStudent.getAddress();
		return studentInfo;
	}
	
	public static void main(String[] args) {
		//create students using constructor
		Student student1 = new Student(20, "Sam Barnum", "3278 Lawrence St, Wakefield, MA");
		Student student2 = new Student(17, "Drew Hickok", "420 Blossom St, Fitchburg, MA");
		Student student3 = new Student(15, "Cam Riley", "1876 Concord St, El Segundo, CA");
		Student student4 = new Student(16, "Dustin Mauary", "142 Bay Colony Dr, Naples, FL");
		Student student5 = new Student(12, "Chris McManus", "87 Adams Rd, Brunswick, ME");
		Student student6 = new Student(14, "Tyler Devine", "54 Weston Woods Cir, Campton, NH");
		Student student7 = new Student(13, "Taylor James", "765 Lexington Ave, New York, NY");
		Student student8 = new Student(11, "Chris Roach", "837 Sheffield Rd, Saint Johns, FL");
		Student student9 = new Student(19, "Derek Bird", "632 Driftwood Cir, Lafayette, CO");
		Student student10 = new Student(18, "Alex Martini", "722 17th St, Boulder, CO");
		//add students to the arraylist arrayListStudent
		arrayListStudent.add(student1);
		arrayListStudent.add(student2);
		arrayListStudent.add(student3);
		arrayListStudent.add(student4);
		arrayListStudent.add(student5);
		arrayListStudent.add(student6);
		arrayListStudent.add(student7);
		arrayListStudent.add(student8);
		arrayListStudent.add(student9);
		arrayListStudent.add(student10);
		
		System.out.println("Original List");	//print original list for reference
		for (Student i : arrayListStudent) {	//enhanced for loop iterates thru the list
			System.out.println(displayStudentInfo(arrayListStudent.indexOf(i)));
		}
		
		System.out.println("");
		
		MergeSort myMergeSort = new MergeSort();	//create new instance of MergeSort
		myMergeSort.mergeSort(arrayListStudent, 0, arrayListStudent.size()-1);	//calling the mergeSort on StudentRollNums
		
		System.out.println("Merge sorted smallest to largest using Student Number");
		for (Student i : arrayListStudent) {										//enhanced for loop iterates thru the list
			System.out.println(displayStudentInfo(arrayListStudent.indexOf(i)));	//SAME COMMAND AS BEFORE THE MERGE SORT
		}
	}
}

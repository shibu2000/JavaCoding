package AggregationTopic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AggregationImplementation {
	static Scanner scanner = new Scanner(System.in);
	static List<Course> courseEntities = new ArrayList<Course>();
	static List<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
	static int courseIDGenerator = 99;
	static int studentIDGenerator = 99;

	public static void main(String[] args) {

		while (true) {
			System.out.println("=====Choose Options=====");
			System.out.println("1. Add course\n" + "2. Add Student\n" + "3. Assign course\n" + "4 Edit Course\n"
					+ "5. Edit Student Details");
			switch (scanner.nextInt()) {
			case 1:
				addCourset();
				break;
			case 2:
				addStudent();
				break;
//		case 3:
//			assignCourse();
//			break;
//		case 4:
//			editCourse();
//			break;
//		case 5:
//			editStudentDetails();
//			break;
			default:
				System.out.println("Invalid Entry!!");
				break;
			}
		}

	}

	private static void addStudent() {
		System.out.println("Enter Student Name: ");
		String course_name = scanner.next();

		System.out.println("Enter Course ID: ");
		int courseID = scanner.nextInt();

		courseEntities.forEach((data) -> {
			if (data.getId() == courseID)
				;
		});

		studentEntities.add(new StudentEntity(courseID, course_name, null));
	}

	private static void addCourset() {
		System.out.println("Enter Course Name: ");
		String course_name = scanner.next();

		System.out.println("Enter Course Price: ");
		double course_price = scanner.nextDouble();

		courseEntities.add(new Course(courseIDGenerator + 1, course_name, course_price));
	}
}

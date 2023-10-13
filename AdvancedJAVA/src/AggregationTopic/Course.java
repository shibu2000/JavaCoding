package AggregationTopic;

public class Course {
	private int id;
	private String course_name;
	private double course_price;

	public Course(int id, String course_name, double course_price) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.course_price = course_price;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public double getCourse_price() {
		return course_price;
	}

	public void setCourse_price(double course_price) {
		this.course_price = course_price;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", course_price=" + course_price + "]";
	}
}

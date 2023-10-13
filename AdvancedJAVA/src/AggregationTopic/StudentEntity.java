package AggregationTopic;

public class StudentEntity {
	private int id;
	private String name;
	
	private Course course;

	public StudentEntity(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", course=" + course + "]";
	}

	

}

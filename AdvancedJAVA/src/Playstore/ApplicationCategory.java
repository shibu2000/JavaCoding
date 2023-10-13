package Playstore;

public class ApplicationCategory {
	private int id;
	private String category_name;
	private String category_desc;

	public ApplicationCategory(int id, String category_name, String category_desc) {
		super();
		this.id = id;
		this.category_name = category_name;
		this.category_desc = category_desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_desc() {
		return category_desc;
	}

	public void setCategory_desc(String category_desc) {
		this.category_desc = category_desc;
	}

	@Override
	public String toString() {
		return "ApplicationCategory [id=" + id + ", category_name=" + category_name + ", category_desc=" + category_desc
				+ "]";
	}

}

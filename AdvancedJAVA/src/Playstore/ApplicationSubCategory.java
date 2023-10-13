package Playstore;

public class ApplicationSubCategory {
	private int id;
	private String sub_cat_name;
	private ApplicationCategory applicationCategory;

	public ApplicationSubCategory(int id, String sub_cat_name, ApplicationCategory applicationCategory) {
		super();
		this.id = id;
		this.sub_cat_name = sub_cat_name;
		this.applicationCategory = applicationCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub_cat_name() {
		return sub_cat_name;
	}

	public void setSub_cat_name(String sub_cat_name) {
		this.sub_cat_name = sub_cat_name;
	}

	public ApplicationCategory getApplicationCategory() {
		return applicationCategory;
	}

	public void setApplicationCategory(ApplicationCategory applicationCategory) {
		this.applicationCategory = applicationCategory;
	}

	@Override
	public String toString() {
		return "ApplicationSubCategory [id=" + id + ", sub_cat_name=" + sub_cat_name + ", applicationCategory="
				+ applicationCategory + "]";
	}

}

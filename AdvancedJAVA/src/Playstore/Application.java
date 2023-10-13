package Playstore;

public class Application {
	private int id;
	private String app_name;
	private String app_desc;
	private double size;

	private ApplicationCategory applicationCategory;

	public Application(int id, String app_name, String app_desc, double size, ApplicationCategory applicationCategory) {
		super();
		this.id = id;
		this.app_name = app_name;
		this.app_desc = app_desc;
		this.size = size;
		this.applicationCategory = applicationCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getApp_desc() {
		return app_desc;
	}

	public void setApp_desc(String app_desc) {
		this.app_desc = app_desc;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public ApplicationCategory getApplicationCategory() {
		return applicationCategory;
	}

	public void setApplicationCategory(ApplicationCategory applicationCategory) {
		this.applicationCategory = applicationCategory;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", app_name=" + app_name + ", app_desc=" + app_desc + ", size=" + size
				+ ", applicationCategory=" + applicationCategory + "]";
	}

}

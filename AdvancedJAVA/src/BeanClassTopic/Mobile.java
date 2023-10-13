package BeanClassTopic;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Mobile implements Serializable{
	private int mobile_id;
	private String mobile_brand;
	private String model_no;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMobile_id() {
		return mobile_id;
	}

	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}

	public String getMobile_brand() {
		return mobile_brand;
	}

	public void setMobile_brand(String mobile_brand) {
		this.mobile_brand = mobile_brand;
	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	@Override
	public String toString() {
		return "Mobile [mobile_id=" + mobile_id + ", mobile_brand=" + mobile_brand + ", model_no=" + model_no + "]";
	}
	
	

}

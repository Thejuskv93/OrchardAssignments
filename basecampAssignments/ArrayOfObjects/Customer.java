package org.mindtree.Assignment.ArrayOfObjects;

public class Customer 
{
	String name;
	String mobile;
	double feedback;
	public Customer(String name,String mobile,double feedback) 
	{
		this.name=name;
		this.mobile=mobile;
		this.feedback=feedback;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public double getFeedback() {
		return feedback;
	}
	public void setFeedback(double feedback) {
		this.feedback = feedback;
	}
	
}

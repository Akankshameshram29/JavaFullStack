package day26;

public class Student {
   String name;
   int age;
   String gender;
   String PhoneNumber;
   String email;
   String BloodGroup;
  float height;
  float weight;
  int semester;
  String department;
  public Student(String name, int age, String gender, String phoneNumber, String email, String bloodGroup, float height,
		float weight, int semester, String department) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	PhoneNumber = phoneNumber;
	this.email = email;
	BloodGroup = bloodGroup;
	this.height = height;
	this.weight = weight;
	this.semester = semester;
	this.department = department;
  }
  @Override
  public String toString() {
	return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", PhoneNumber=" + PhoneNumber + ", email="
			+ email + ", BloodGroup=" + BloodGroup + ", height=" + height + ", weight=" + weight + ", semester="
			+ semester + ", department=" + department + "]";
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public int getAge() {
	return age;
  }
  public void setAge(int age) {
	this.age = age;
  }
  public String getGender() {
	return gender;
  }
  public void setGender(String gender) {
	this.gender = gender;
  }
  public String getPhoneNumber() {
	return PhoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
  public String getBloodGroup() {
	return BloodGroup;
  }
  public void setBloodGroup(String bloodGroup) {
	BloodGroup = bloodGroup;
  }
  public float getHeight() {
	return height;
  }
  public void setHeight(float height) {
	this.height = height;
  }
  public float getWeight() {
	return weight;
  }
  public void setWeight(float weight) {
	this.weight = weight;
  }
  public int getSemester() {
	return semester;
  }
  public void setSemester(int semester) {
	this.semester = semester;
  }
  public String getDepartment() {
	return department;
  }
  public void setDepartment(String department) {
	this.department = department;
  }
  
  
  
}

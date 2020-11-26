package ncpproject.model;

public class employee {
 private String Name;
 private String department;
 private String Designation;
 private String Age;
 private String Email;
 private String Password;
 private String MemberID;
public String getMemberID() {
	return MemberID;
}
public void setMemberID(String memberID) {
	MemberID = memberID;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
 
 
}

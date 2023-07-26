class PassportApplicationTester{

	public static void main(String pass[]){
	
		PassportApplication details = new PassportApplication();
		details.setId(1);
		System.out.println(details.getId());
		details.setAge(21);
		System.out.println(details.getAge());
		details.setDob("September-27");
		System.out.println(details.getDob());
		PassportApplication details1 = new PassportApplication();
		details.setBirthPlace("Karnataka");
		System.out.println(details.getBirthPlace());
		details.setMaritalStatus("Unmarried");
		System.out.println(details.getMaritalStatus());
		details.setEmploymentStatus("Student");
		System.out.println(details.getEmploymentStatus());
		details.setQualification("Graduate");
		System.out.println(details.getQualification());
		details.setAddress("Hvr");
		System.out.println(details.getAddress());
		PassportApplication details2 = new PassportApplication();
		details.setNationality("India");
		System.out.println(details.getNationality());
		details.setType("e-passport");
		System.out.println(details.getType());
		details.setColor("Orange");
		System.out.println(details.getColor());
		details.setPassportNo("747Raksh2709");
		System.out.println(details.getPassportNo());
		details.setdateofissue("Feb-15");
		System.out.println(details.getdateofissue());
	}
}
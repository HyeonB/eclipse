package dto;

// DTO 생성해 보세요
public class UserMemberDTO {
	
	private String id;
	private String pass;
	private String name;
	private String enter;
	private String gender;
	private String phone;
	
	// 기본 생성자
	public UserMemberDTO() {}

	// 생성자 오버로딩
	public UserMemberDTO(String id, String name, String enter) {
		super();
		this.id = id;
		this.name = name;
		this.enter = enter;
	}

	public UserMemberDTO(String id, String pass, String name,String gender, String phone) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}

	public UserMemberDTO(String id, String pass, String name, String enter, String gender, String phone) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.enter = enter;
		this.gender = gender;
		this.phone = phone;
	}

	// getter / setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getEnter() {
		return enter;
	}

	public void setEnter(String enter) {
		this.enter = enter;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}





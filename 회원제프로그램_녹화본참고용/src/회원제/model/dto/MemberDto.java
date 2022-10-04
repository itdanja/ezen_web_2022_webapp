package 회원제.model.dto;

public class MemberDto {
	
	private int no;
	private String id;
	private String password;
	private String name;
	private String phone;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int no, String id, String password, String name, String phone) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}


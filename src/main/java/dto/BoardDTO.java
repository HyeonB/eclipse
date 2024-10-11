package dto;

public class BoardDTO {
	private String no;
	private String id;
	private String title;
	private String detail;
	private String enter;

	
	// 기본 생성자
	public BoardDTO() {}

	// 생성자 오버로딩
	public BoardDTO(String no, String id, String title, String detail, String enter) {
		super();
		this.setNo(no);
		this.setId(id);
		this.setTitle(title);
		this.setDetail(detail);
		this.setEnter(enter);
	}
	
	public BoardDTO(String id, String title, String detail) {
		super();

		this.setId(id);
		this.setTitle(title);
		this.setDetail(detail);

	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEnter() {
		return enter;
	}

	public void setEnter(String enter) {
		this.enter = enter;
	}
}

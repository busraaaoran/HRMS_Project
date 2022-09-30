package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_employees")
public class SystemEmployee {
	
	@Column(name="user_id")
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="user_name")
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public SystemEmployee() {
		super();
	}

	public SystemEmployee(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

}

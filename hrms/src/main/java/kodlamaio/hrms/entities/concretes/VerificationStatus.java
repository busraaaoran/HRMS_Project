package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="verification_status")
public class VerificationStatus {
	
	@Id
	@GeneratedValue
	@Column(name="status_id")
	private int id;
	
	@Column(name="status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public VerificationStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	public VerificationStatus() {
		super();
	}

}

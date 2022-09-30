package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_verification")
public class EmailVerification {
	
	@Column(name="user_id")
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="verification_code")
	private int verificationCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(int verificationCode) {
		this.verificationCode = verificationCode;
	}

	public EmailVerification() {
		super();
	}

	public EmailVerification(int id, int verificationCode) {
		super();
		this.id = id;
		this.verificationCode = verificationCode;
	}

}

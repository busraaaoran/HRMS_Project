package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobs")
public class Job {
	
	@Column(name="job_id")
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="company_id")
	private int companyId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="availability")
	private boolean availability;
	
	@Column(name="expiration_date")
	private Date expirationDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Job(int id, int companyId, String title, boolean availability, Date expirationDate) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.title = title;
		this.availability = availability;
		this.expirationDate = expirationDate;
	}

	public Job() {
		super();
	}
	
}

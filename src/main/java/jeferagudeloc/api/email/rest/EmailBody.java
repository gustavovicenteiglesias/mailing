package jeferagudeloc.api.email.rest;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table (name = "body")
public class EmailBody implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    private Integer id;
	
	private String email;
	private String subject;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "IdCuerpo", updatable = false, nullable = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private EmailCuerpo content;

	public EmailBody() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public EmailCuerpo getContent() {
		return content;
	}

	public void setContent(EmailCuerpo content) {
		this.content = content;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmailBody [id=" + id + ", email=" + email + ", subject=" + subject + ", content=" + content + "]";
	}

	
	
	
	
	
}

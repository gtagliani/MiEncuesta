package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Polls generated by hbm2java
 */
@Entity
@Table(name = "Polls", schema = "dbo", catalog = "myEncuesta")
public class Polls implements java.io.Serializable {

	private Integer id;
	private String description;
	private String name;
	private String expressionAllowedProfile;
	private Date availableFrom;
	private Date availableTo;
	private Boolean isPublic;
	private Set<AllowedToResponsePoll> allowedToResponsePolls = new HashSet<AllowedToResponsePoll>(0);
	private Set<PollResponsesHeader> pollResponsesHeaders = new HashSet<PollResponsesHeader>(0);
	private Set<Pages> pageses = new HashSet<Pages>(0);

	public Polls() {
	}

	public Polls(String description, String name, String expressionAllowedProfile, Date availableFrom, Date availableTo,
			Boolean isPublic, Set<AllowedToResponsePoll> allowedToResponsePolls,
			Set<PollResponsesHeader> pollResponsesHeaders, Set<Pages> pageses) {
		this.description = description;
		this.name = name;
		this.expressionAllowedProfile = expressionAllowedProfile;
		this.availableFrom = availableFrom;
		this.availableTo = availableTo;
		this.isPublic = isPublic;
		this.allowedToResponsePolls = allowedToResponsePolls;
		this.pollResponsesHeaders = pollResponsesHeaders;
		this.pageses = pageses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "expressionAllowedProfile")
	public String getExpressionAllowedProfile() {
		return this.expressionAllowedProfile;
	}

	public void setExpressionAllowedProfile(String expressionAllowedProfile) {
		this.expressionAllowedProfile = expressionAllowedProfile;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "availableFrom", length = 23)
	public Date getAvailableFrom() {
		return this.availableFrom;
	}

	public void setAvailableFrom(Date availableFrom) {
		this.availableFrom = availableFrom;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "availableTo", length = 23)
	public Date getAvailableTo() {
		return this.availableTo;
	}

	public void setAvailableTo(Date availableTo) {
		this.availableTo = availableTo;
	}

	@Column(name = "IsPublic")
	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "polls")
	public Set<AllowedToResponsePoll> getAllowedToResponsePolls() {
		return this.allowedToResponsePolls;
	}

	public void setAllowedToResponsePolls(Set<AllowedToResponsePoll> allowedToResponsePolls) {
		this.allowedToResponsePolls = allowedToResponsePolls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "polls")
	public Set<PollResponsesHeader> getPollResponsesHeaders() {
		return this.pollResponsesHeaders;
	}

	public void setPollResponsesHeaders(Set<PollResponsesHeader> pollResponsesHeaders) {
		this.pollResponsesHeaders = pollResponsesHeaders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "polls")
	public Set<Pages> getPageses() {
		return this.pageses;
	}

	public void setPageses(Set<Pages> pageses) {
		this.pageses = pageses;
	}

}

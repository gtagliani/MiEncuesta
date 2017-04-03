package org.myEncuesta.persistence.interfaces;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.myEncuesta.persistence.hibernate.Polls;

public interface IAllowedToResponsePoll {

	Integer getId();

	void setId(Integer id);

	Polls getPolls();

	void setPolls(Polls polls);

	String getEmail();

	void setEmail(String email);

}
package org.myEncuesta.persistence.interfaces;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.myEncuesta.persistence.hibernate.QuestionFields;

public interface IDataList {

	Integer getId();

	void setId(Integer id);

	IDataListItems getDataListsItems();

	void setDataListsItems(IDataListItems dataListsItems);

	String getName();

	void setName(String name);

	Set<QuestionFields> getQuestionFieldses();

	void setQuestionFieldses(Set<QuestionFields> questionFieldses);

}
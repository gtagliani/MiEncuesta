package org.myEncuesta.persistence.interfaces;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.myEncuesta.persistence.hibernate.DataList;

public interface IDataListItems {

	Integer getId();

	void setId(Integer id);

	Integer getGroupList();

	void setGroupList(Integer groupList);

	String getLabel();

	void setLabel(String label);

	Set<DataList> getDataLists();

	void setDataLists(Set<DataList> dataLists);

}
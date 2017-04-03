package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class QuestionFields.
 * @see org.myEncuesta.persistence.hibernate.QuestionFields
 * @author Hibernate Tools
 */
@Stateless
public class QuestionFieldsHome {

	private static final Log log = LogFactory.getLog(QuestionFieldsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(QuestionFields transientInstance) {
		log.debug("persisting QuestionFields instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(QuestionFields persistentInstance) {
		log.debug("removing QuestionFields instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public QuestionFields merge(QuestionFields detachedInstance) {
		log.debug("merging QuestionFields instance");
		try {
			QuestionFields result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public QuestionFields findById(Integer id) {
		log.debug("getting QuestionFields instance with id: " + id);
		try {
			QuestionFields instance = entityManager.find(QuestionFields.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Questions.
 * @see org.myEncuesta.persistence.hibernate.Questions
 * @author Hibernate Tools
 */
@Stateless
public class QuestionsHome {

	private static final Log log = LogFactory.getLog(QuestionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Questions transientInstance) {
		log.debug("persisting Questions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Questions persistentInstance) {
		log.debug("removing Questions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Questions merge(Questions detachedInstance) {
		log.debug("merging Questions instance");
		try {
			Questions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Questions findById(Integer id) {
		log.debug("getting Questions instance with id: " + id);
		try {
			Questions instance = entityManager.find(Questions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

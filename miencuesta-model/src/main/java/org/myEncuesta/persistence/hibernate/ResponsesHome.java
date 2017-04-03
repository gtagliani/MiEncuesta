package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Responses.
 * @see org.myEncuesta.persistence.hibernate.Responses
 * @author Hibernate Tools
 */
@Stateless
public class ResponsesHome {

	private static final Log log = LogFactory.getLog(ResponsesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Responses transientInstance) {
		log.debug("persisting Responses instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Responses persistentInstance) {
		log.debug("removing Responses instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Responses merge(Responses detachedInstance) {
		log.debug("merging Responses instance");
		try {
			Responses result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Responses findById(Integer id) {
		log.debug("getting Responses instance with id: " + id);
		try {
			Responses instance = entityManager.find(Responses.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Polls.
 * @see org.myEncuesta.persistence.hibernate.Polls
 * @author Hibernate Tools
 */
@Stateless
public class PollsHome {

	private static final Log log = LogFactory.getLog(PollsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Polls transientInstance) {
		log.debug("persisting Polls instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Polls persistentInstance) {
		log.debug("removing Polls instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Polls merge(Polls detachedInstance) {
		log.debug("merging Polls instance");
		try {
			Polls result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Polls findById(Integer id) {
		log.debug("getting Polls instance with id: " + id);
		try {
			Polls instance = entityManager.find(Polls.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

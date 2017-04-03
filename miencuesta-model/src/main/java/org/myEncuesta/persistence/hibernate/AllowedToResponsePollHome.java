package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myEncuesta.persistence.interfaces.IAllowedToResponsePoll;

/**
 * Home object for domain model class AllowedToResponsePoll.
 * @see org.myEncuesta.persistence.hibernate.AllowedToResponsePoll
 * @author Hibernate Tools
 */
@Stateless
public class AllowedToResponsePollHome {

	private static final Log log = LogFactory.getLog(AllowedToResponsePollHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(IAllowedToResponsePoll transientInstance) {
		log.debug("persisting AllowedToResponsePoll instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(IAllowedToResponsePoll persistentInstance) {
		log.debug("removing AllowedToResponsePoll instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public IAllowedToResponsePoll merge(AllowedToResponsePoll detachedInstance) {
		log.debug("merging AllowedToResponsePoll instance");
		try {
			IAllowedToResponsePoll result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IAllowedToResponsePoll findById(Integer id) {
		log.debug("getting AllowedToResponsePoll instance with id: " + id);
		try {
			IAllowedToResponsePoll instance = entityManager.find(AllowedToResponsePoll.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

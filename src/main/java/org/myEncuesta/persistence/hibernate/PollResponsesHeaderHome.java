package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PollResponsesHeader.
 * @see org.myEncuesta.persistence.hibernate.PollResponsesHeader
 * @author Hibernate Tools
 */
@Stateless
public class PollResponsesHeaderHome {

	private static final Log log = LogFactory.getLog(PollResponsesHeaderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PollResponsesHeader transientInstance) {
		log.debug("persisting PollResponsesHeader instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PollResponsesHeader persistentInstance) {
		log.debug("removing PollResponsesHeader instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PollResponsesHeader merge(PollResponsesHeader detachedInstance) {
		log.debug("merging PollResponsesHeader instance");
		try {
			PollResponsesHeader result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PollResponsesHeader findById(Integer id) {
		log.debug("getting PollResponsesHeader instance with id: " + id);
		try {
			PollResponsesHeader instance = entityManager.find(PollResponsesHeader.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

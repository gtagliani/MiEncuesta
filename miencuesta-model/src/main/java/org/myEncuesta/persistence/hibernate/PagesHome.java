package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Pages.
 * @see org.myEncuesta.persistence.hibernate.Pages
 * @author Hibernate Tools
 */
@Stateless
public class PagesHome {

	private static final Log log = LogFactory.getLog(PagesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Pages transientInstance) {
		log.debug("persisting Pages instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Pages persistentInstance) {
		log.debug("removing Pages instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Pages merge(Pages detachedInstance) {
		log.debug("merging Pages instance");
		try {
			Pages result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pages findById(Integer id) {
		log.debug("getting Pages instance with id: " + id);
		try {
			Pages instance = entityManager.find(Pages.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

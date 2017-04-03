package org.myEncuesta.persistence.hibernate;
// Generated Apr 3, 2017 10:52:47 AM by Hibernate Tools 5.2.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FieldTypes.
 * @see org.myEncuesta.persistence.hibernate.FieldTypes
 * @author Hibernate Tools
 */
@Stateless
public class FieldTypesHome {

	private static final Log log = LogFactory.getLog(FieldTypesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FieldTypes transientInstance) {
		log.debug("persisting FieldTypes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FieldTypes persistentInstance) {
		log.debug("removing FieldTypes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FieldTypes merge(FieldTypes detachedInstance) {
		log.debug("merging FieldTypes instance");
		try {
			FieldTypes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FieldTypes findById(Integer id) {
		log.debug("getting FieldTypes instance with id: " + id);
		try {
			FieldTypes instance = entityManager.find(FieldTypes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

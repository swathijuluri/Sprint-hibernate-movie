package nz.co.sample.springHibernate.dao.impl;

import nz.co.sample.springHibernate.dao.MovieDao;
import nz.co.sample.springHibernate.entities.Movie;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;


public class MovieDaoImpl implements MovieDao {

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public void createMovie(Movie movie) {
		hibernateTemplate.saveOrUpdate(movie);
	}

}
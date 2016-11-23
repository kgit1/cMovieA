package com.cMovieA.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cMovieA.entity.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Movie> getMovies() {
		Session session = sessionFactory.getCurrentSession();

		Query<Movie> theQuery = session.createQuery("from Movie", Movie.class);

		List<Movie> movies = theQuery.getResultList();

		return movies;
	}

	@Override
	public void saveMovie(Movie theMovie) {
		Session session = sessionFactory.getCurrentSession();

		session.save(theMovie);
	}

	@Override
	public void deleteMovieById(int theId) {
		Session session = sessionFactory.getCurrentSession();

		Query theQuery = session
				.createQuery("delete from Movie where id=:movieId");
		theQuery.setParameter("movieId", theId);
		theQuery.executeUpdate();
	}

}

package jewelry.Backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jewelry.Backend.dao.IUserDAO;
import jewelry.Backend.model.Address;
import jewelry.Backend.model.Cart;
import jewelry.Backend.model.User;



@Repository("userDAO")
@Transactional
public class UserDAOImpl implements IUserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<User> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("FROM User", User.class).getResultList();
	}

	public User getUser(int id) {
		return sessionFactory.getCurrentSession().get(User.class, Integer.valueOf(id));
	}

	public boolean updateUser(User u) {
		try {
			sessionFactory.getCurrentSession().update(u);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean deleteUser(int id) {
		try {
			sessionFactory.getCurrentSession().delete(getUser(id));
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean addUser(User u) {
		try {
			sessionFactory.getCurrentSession().persist(u);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public boolean addUserAddress(Address address) {
		try {
			sessionFactory.getCurrentSession().save(address);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean addUserCart(Cart cart){
			try {
				sessionFactory.getCurrentSession().save(cart);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public User getUserByUserName(String userName) {
		String selectUser="from User where userName=:userName";
		return (User)sessionFactory.getCurrentSession().createQuery(selectUser,User.class).setParameter("userName",userName).getSingleResult();
	}

}

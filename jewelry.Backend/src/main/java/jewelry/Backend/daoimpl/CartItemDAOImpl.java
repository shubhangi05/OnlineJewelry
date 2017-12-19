package jewelry.Backend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jewelry.Backend.dao.ICartItemDAO;
import jewelry.Backend.dao.IUserDAO;
import jewelry.Backend.model.Cart;
import jewelry.Backend.model.CartItem;




@Repository("cartItemDAO")
@Transactional
public class CartItemDAOImpl implements ICartItemDAO {
	@Autowired
	SessionFactory sessionFactory;
	IUserDAO userDAO;

	public List<CartItem> getAllCartItem(Cart cart) {

		return sessionFactory.getCurrentSession().createQuery("from CartItem where cart=:cart").setParameter("cart",cart).getResultList();

	}

	public CartItem getCartItem(int id) {
		return sessionFactory.getCurrentSession().get(CartItem.class, Integer.valueOf(id));
	}

	public boolean addCartItem(CartItem ci) {
		try {
			sessionFactory.getCurrentSession().save(ci);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateCartItem(CartItem ci) {
		try {
			sessionFactory.getCurrentSession().update(ci);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCartItem(int cartItemId) {
		try {
			sessionFactory.getCurrentSession().delete(getCartItem(cartItemId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteAllCartItem(List<CartItem> ci) {
		try {
			for(CartItem i:ci)
			{
				sessionFactory.getCurrentSession().delete(i);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCart(Cart c) {
		try {
			sessionFactory.getCurrentSession().update(c);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean deleteCart(int cid) {
//		try {
//			sessionFactory.getCurrentSession().delete(cid);
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

}
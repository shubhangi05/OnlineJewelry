package jewelry.Backend.dao;

import java.util.List;

import jewelry.Backend.model.Cart;
import jewelry.Backend.model.CartItem;

public interface ICartItemDAO 
{
    public List<CartItem> getAllCartItem(Cart cart);
    public CartItem getCartItem(int id);
    
    //CRUD for cart items
    public boolean addCartItem(CartItem ci);
    public boolean updateCartItem(CartItem ci);
    public boolean deleteCartItem(int cartItemId);
    public boolean deleteAllCartItem(List<CartItem> c);

    //CRUD for cart
    public boolean updateCart(Cart c);
    //public boolean deleteCart(int cid);
}


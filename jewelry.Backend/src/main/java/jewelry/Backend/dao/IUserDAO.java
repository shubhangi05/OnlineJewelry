package jewelry.Backend.dao;

import java.util.List;

import jewelry.Backend.model.Address;
import jewelry.Backend.model.Cart;
import jewelry.Backend.model.User;



public interface IUserDAO 
{
public List<User> getAllUsers();
public User getUser(int id);
public boolean updateUser(User u);
public boolean deleteUser(int id);
public boolean addUser(User u);
public boolean addUserAddress(Address address);
public boolean addUserCart(Cart cart);

public User getUserByUserName(String userName);

}
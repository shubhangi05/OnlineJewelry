package jewelry.Backend.dao;

import java.util.List;

import jewelry.Backend.model.Address;
import jewelry.Backend.model.User;

public interface IAddressDAO {
	public List<Address> getAllAddress();

	public Address getAddress(int id);
	
	public Address getAddressByUser(User user);

	public boolean deleteAddress(int id);

	public boolean addAddress(Address a);
	
	public boolean updateAddress(Address a);

}

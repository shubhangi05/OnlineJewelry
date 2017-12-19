package jewelry.Backend.dao;

import jewelry.Backend.model.Payment;
import jewelry.Backend.model.User;

public interface IPaymentDAO {
	 public Payment getPaymentDetails(User u);
	 public boolean addPayment(Payment p);
	}

//package jewelry.Backend;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import jewelry.BackEnd.dao.IUserDAO;
//import jewelry.BackEnd.model.User;
//
//public class UsersTestCase {
//	private static AnnotationConfigApplicationContext context;
//	private static IUserDAO userDAO;
//	private User user;
//	
//	@BeforeClass
//	public static void init() {
//		context = new AnnotationConfigApplicationContext();
//		context.scan("net.sports.ZenSportsBackEnd");
//		context.refresh();
//		userDAO=(IUserDAO)context.getBean("userDAO");
//	}
//	
////	@Test
////	public void testAddUser()
////	{
////		user=new User();
////		user.setEnabled(false);
////		user.setUserName("Ed");
////		user.setUserFullName("Edward Cullen");
////		user.setUserMobile("8010017053");
////		user.setUserPassword("user@1");
////		user.setrole("User");
////		user.setUserSecurityQ("Name of the first pet");
////		user.setUserSecurityA("Milo");
////		user.setUserEmail("edward@cullen.com");
////		
////		assertEquals("Successfully added a user inside the table .",true,userDAO.addUser(user));
////	}
////	
////	@Test
////	public void testGetUser()
////	{
////		user=userDAO.getUser(1);
////		assertEquals("Retrieving data based on id from table","Edward Cullen",user.getUserFullName());
////	}
////	
////	@Test
////	public void testUpdateUser()
////	{
////		user=userDAO.getUser(1);
////		user.setEnabled(false);
////		user.setUserName("Edward Cullen");
////		user.setUserMobile("8826488032");
////		user.setUserPassword("bella");
////		user.setUserRole("User");
////		user.setUserSecurityQ("Name of the first pet");
////		user.setUserSecurityA("Milo");
////		user.setUserEmail("edward@cullen.com");
////		
////		assertEquals("Updating user based on id from table",true,userDAO.updateUser(user));
////	}
////	
////	@Test
////	public void testDeleteUser()
////	{
////		assertEquals("Deleting user based on id from table",true,userDAO.deleteUser(1));
////	}
//
//}

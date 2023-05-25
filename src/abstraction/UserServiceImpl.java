package abstraction;

public class UserServiceImpl  implements UserService{

	@Override
	public void deleteUser() {
		 System.out.println("delete success");
	}

	@Override
	public void addUser() {
		System.out.println("add success");
	}

	@Override
	public void print() {
		System.out.println("printing........");
	}

}

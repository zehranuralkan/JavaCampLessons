package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(kodlamaio.northwind.core.dataAccess.UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>("Kullanıcı bulundu",this.userDao.findByEmail(email));
	}

	
	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>("Kullanıcılar listelendi",this.userDao.findAll());
	}

}

package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Kullanicilar listelendi");
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email));
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
	    return new SuccessResult("Kullanici eklendi.");
	}

	

}

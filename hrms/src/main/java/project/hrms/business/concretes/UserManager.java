package project.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.UserDao;
import project.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {

    @Autowired
    private UserDao userDao;
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }
    
    //Methods
    @Override
    public Result add(User user) {
       this.userDao.save(user);
        return new SuccessResult("Kullanıcı eklendi");
    }

    @Override
    public DataResult<List<User>> getAll() {
        var data=this.userDao.findAll();
        return new SuccessDataResult<List<User>>(data,"Kullanıcılar listelendi");
    }

    @Override
    public DataResult<User> getByEmail(String email) {
       var data=this.userDao.getByEmail(email);
        return new SuccessDataResult<User>(data);
    }
}

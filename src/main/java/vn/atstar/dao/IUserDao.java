package vn.atstar.dao;

import vn.atstar.models.UserModel;
import java.util.List;

public interface IUserDao {
    List<UserModel> findAll();

    UserModel findById(int id);

    UserModel findByUserName(String username);

    void insert(UserModel user);
    
    
}

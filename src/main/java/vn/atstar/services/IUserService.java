package vn.atstar.services;


import vn.atstar.models.*;
public interface IUserService {
UserModel login(String username, String password);
UserModel FindByUserName(String username);
boolean register(UserModel user);
boolean updatePassword(String username, String newPassword);

}
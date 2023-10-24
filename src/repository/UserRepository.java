/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.UsersDao;
import java.util.ArrayList;
import java.util.Locale;
import model.Users;

public class UserRepository implements IUserRepository {

    private ArrayList<Users> students;

    public UserRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void login(Locale language) {
        UsersDao.Instance().login(language);
    }
}

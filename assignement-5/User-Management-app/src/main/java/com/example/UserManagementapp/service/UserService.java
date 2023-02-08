package com.example.UserManagementapp.service;

import com.example.UserManagementapp.model.UserModel;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {

    private static List<UserModel> users = new ArrayList<>();
    private static int countUser = 0;

    static{
        users.add(new UserModel(++countUser,"Ankush", "ankush@12", "Agra", 9870811484l));
        users.add(new UserModel(++countUser,"Manish", "man@1234", "Jaipur", 9356757799l));
        users.add(new UserModel(++countUser,"Virat", "virat@1405", "Delhi", 9368613242l));
        users.add(new UserModel(++countUser,"Rohit", "rohit@269", "Mumbai", 9234567890l));
        users.add(new UserModel(++countUser,"Pawan", "pawan@456", "Bareilly", 9034567891l));
    }

    public List<UserModel> findAll(){ // business logic
        return users;
    }

    public UserModel findById(int userId){
        Predicate<? super UserModel> predicate = userModel -> userModel.getUserId() == userId;
        UserModel userModel = users.stream().filter(predicate).findFirst().get();
        return userModel;

    }

    public void addUserModel(UserModel userModel){
        users.add(userModel);
    }

    public void deleteUserModel(int userId){
        Predicate<? super UserModel> predicate = userModel -> userModel.getUserId() == userId;
        users.removeIf(predicate);
    }

    public void updateUserModel(int userId, UserModel newUserModel){
        // step1 : find user to be update
        // step2 : update user

        UserModel userModel = findById(userId); // step1

        userModel.setUserId(newUserModel.getUserId()); // step2
        userModel.setUserName(newUserModel.getUserName());
        userModel.setName(newUserModel.getName());
        userModel.setAddress(newUserModel.getAddress());
        userModel.setPhoneNumber(newUserModel.getPhoneNumber());

    }

}

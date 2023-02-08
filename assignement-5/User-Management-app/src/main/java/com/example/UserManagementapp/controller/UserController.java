package com.example.UserManagementapp.controller;

import com.example.UserManagementapp.model.UserModel;
import com.example.UserManagementapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vi/User-management-app")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // addUser-endpoint
    // http://localhost:8080/api/vi/User-management-app/add-userModel
    @PostMapping("/add-userModel")
    public void addUserModel(@RequestBody UserModel userModel){
        userService.addUserModel(userModel);
    }

    // getUser/{userId} - endpoint
    // http://localhost:8080/api/vi/User-management-app/find-user/userId/5
    @GetMapping("find-user/userId/{userId}")
    public UserModel findUserModelById(@PathVariable int userId){
        return userService.findById(userId);
    }

    // getAllUser - endpoint
    // http://localhost:8080/api/vi/User-management-app/find-all
    @GetMapping("find-all")
    public List<UserModel> findAllUserModels(){
        return userService.findAll();
    }


    // updateUserInfo - endpoint
    // http://localhost:8080/api/vi/User-management-app/update-userModel/userId/3
    @PutMapping("update-userModel/userId/{userId}")
    public void updateUserModel(@PathVariable int userId, @RequestBody UserModel userModel){
        userService.updateUserModel(userId, userModel);
    }

    // delete user - endpoint
    // http://localhost:8080/api/vi/User-management-app/delete-userModel/userId/3
    @DeleteMapping("delete-userModel/userId/{userId}")
    public void deleteUserModel(@PathVariable int userId){
        userService.deleteUserModel(userId);
    }




}

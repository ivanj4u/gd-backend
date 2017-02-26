package id.co.aribanilia.gdbackend.controller;

import id.co.aribanilia.gdbackend.dao.UserDao;
import id.co.aribanilia.gdbackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ivan_j4u on 2/24/2017.
 */
@RestController
@RequestMapping("/api")
public class UserController {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @PreAuthorize("hasAuthority('USER_VIEW')")
    @GetMapping("/user")
    public Page<User> allUser(Pageable page) {
        return userDao.findAll(page);
    }

    @PreAuthorize("hasAuthority('USER_EDIT')")
    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDao.save(user);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/me")
    public Authentication me(Authentication currentUser) {
        return currentUser;
    }

}

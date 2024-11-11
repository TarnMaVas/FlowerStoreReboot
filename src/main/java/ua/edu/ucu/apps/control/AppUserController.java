package ua.edu.ucu.apps.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.model.AppUser;
import ua.edu.ucu.apps.service.AppUserService;

@RestController
@RequestMapping("/users")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping
    public AppUser addUser(@RequestBody AppUser appUser) {
        return appUserService.addUser(appUser);
    }

    @GetMapping
    public List<AppUser> findAllUsers() {
        return appUserService.findAllUsers();
    }
}
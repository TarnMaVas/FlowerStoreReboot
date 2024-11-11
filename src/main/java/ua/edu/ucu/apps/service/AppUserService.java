package ua.edu.ucu.apps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.model.AppUser;
import ua.edu.ucu.apps.repo.AppUserRepository;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser addUser(AppUser appUser) {
        Optional<AppUser> existingUser = appUserRepository
                            .findUserByEmail(appUser.getEmail());
        if (existingUser.isPresent()) {
            throw new RuntimeException("Invalid email");
        }
        return appUserRepository.save(appUser);
    }

    public Optional<AppUser> findUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }

    public List<AppUser> findAllUsers() {
        return appUserRepository.findAll();
    }
}

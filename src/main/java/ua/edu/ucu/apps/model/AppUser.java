package ua.edu.ucu.apps.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "dob")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate dob;

    public AppUser() {
    }

    public AppUser(String newEmail, LocalDate newDob) {
        this.email = newEmail;
        this.dob = newDob;
    }
}
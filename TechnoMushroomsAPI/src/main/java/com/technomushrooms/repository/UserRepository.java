package com.technomushrooms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.technomushrooms.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // This method is used to authenticate users based on username and password.
    User findByUsernameAndPassword(String username, String password);

    // This method will be used by Spring Security to load a user by username only.
    User findByUsername(String username);
}

package com.NIED.service;

import com.NIED.model.AdminUser;
import com.NIED.repository.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminUserService {

    @Autowired
    private AdminUserRepository adminUserRepository;

    public AdminUser createAdminUser(AdminUser adminUser) {
        // Here you can add logic like password hashing before saving
        return adminUserRepository.save(adminUser);
    }

    public Optional<AdminUser> getAdminByUsername(String username) {
        return adminUserRepository.findByUsername(username);
    }
}
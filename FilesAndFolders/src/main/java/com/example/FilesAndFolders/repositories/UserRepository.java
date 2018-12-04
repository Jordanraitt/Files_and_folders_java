package com.example.FilesAndFolders.repositories;

import com.example.FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

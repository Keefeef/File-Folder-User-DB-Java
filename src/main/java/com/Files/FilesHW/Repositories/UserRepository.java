package com.Files.FilesHW.Repositories;


import com.Files.FilesHW.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

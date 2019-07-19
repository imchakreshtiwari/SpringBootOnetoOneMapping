package com.jpamapping.LearnMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpamapping.LearnMapping.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

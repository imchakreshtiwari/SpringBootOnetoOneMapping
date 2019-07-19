package com.jpamapping.LearnMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpamapping.LearnMapping.Model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}

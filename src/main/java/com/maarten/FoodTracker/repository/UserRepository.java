package com.maarten.FoodTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.maarten.FoodTracker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.ranminacodes.Socialfitness.repository;

import com.ranminacodes.Socialfitness.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface userRepository extends JpaRepository<users,Integer> {
}

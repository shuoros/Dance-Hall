package com.github.nazaninhmz.danceHall.repository;

import com.github.nazaninhmz.danceHall.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User , Integer> {


}

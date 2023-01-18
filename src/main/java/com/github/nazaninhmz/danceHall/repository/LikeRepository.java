package com.github.nazaninhmz.danceHall.repository;

import com.github.nazaninhmz.danceHall.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository <Like, Integer>{


}

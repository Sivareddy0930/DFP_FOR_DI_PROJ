package com.dateFilter.DFP;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

//    @Query(value = "SELECT * FROM app_user where from_date BETWEEN :startDate AND :endDate",nativeQuery = true)
//    List<User> findByTimestampBetween(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

    // Automatically generates the query to select users between startDate and endDate
    List<User> findByCreatedDateBetween(LocalDateTime startDate, LocalDateTime endDate);
}

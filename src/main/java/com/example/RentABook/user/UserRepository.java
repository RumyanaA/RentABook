package com.example.RentABook.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    @Query("select u from Users u where u.name = ?1 and u.email = ?2")
    UserNameAndEmail findUser(String name, String email);

}

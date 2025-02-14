package com.neoteric.springJWT.repository;

import com.neoteric.springJWT.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<Users,Integer> {

   Users findByUsername(String username);



}

package com.neoteric.springJWT.service;

import com.neoteric.springJWT.model.UserPrincipal;
import com.neoteric.springJWT.model.Users;
import com.neoteric.springJWT.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDeatilsService  implements UserDetailsService {

    @Autowired
    private UserRepo repo;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user =repo.findByUsername(username);


        if (user == null){
            System.out.println("User not Found");
            throw new UsernameNotFoundException("User not found");
        }


        return new UserPrincipal(user);
    }
}

package com.kubsu.gameservice.services;

import com.kubsu.gameservice.entities.Role;
import com.kubsu.gameservice.entities.User;
import com.kubsu.gameservice.repositories.RoleRepository;
import com.kubsu.gameservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceUtil implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public String regAcc(String username, String password){

        User user = userRepository.findByUsername(username);
        if (user == null) {

            User newUser = new User();
            newUser.setUsername(username);
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(11);
            newUser.setPassword(encoder.encode(password));
            Set<Role> roles = new HashSet<>();
            roles.add(roleRepository.findOne((long) 2));
            newUser.setRoles(roles);

            userRepository.save(newUser);

            return "Successfull";
        }
            return "Fail";

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails loadedUser;

        try {
            User client = userRepository.findByUsername(username);
            loadedUser = new org.springframework.security.core.userdetails.User(
                    client.getUsername(),
                    client.getPassword(),
                    client.getRoles());
        } catch (Exception repositoryProblem){
            throw new InternalAuthenticationServiceException(repositoryProblem.getMessage(), repositoryProblem);
        }
        return  loadedUser;
    }
}

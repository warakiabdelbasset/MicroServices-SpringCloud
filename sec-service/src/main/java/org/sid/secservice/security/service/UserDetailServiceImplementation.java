package org.sid.secservice.security.service;

import org.sid.secservice.security.entities.AppUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Service
public class UserDetailServiceImplementation implements UserDetailsService {
    private AccountService accountService;

    public UserDetailServiceImplementation(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser=accountService.loadUserByUsername(username);
        Collection<GrantedAuthority> authorities=new ArrayList<>();
        appUser.getAppRoles().forEach(p->{
            authorities.add(new SimpleGrantedAuthority(p.getRoleName()));
        });
        return new User(appUser.getUsername(), appUser.getPassword(), authorities);

    }
}

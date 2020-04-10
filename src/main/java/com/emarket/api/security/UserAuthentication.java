package com.emarket.api.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;
import java.util.Collection;

public class UserAuthentication extends User implements Serializable {

    public UserAuthentication(String username,
                              String password,
                              boolean enabled,
                              boolean accountNonExpired,
                              boolean credentialsNonExpired,
                              boolean accountNonLocked,
                              Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public static UserAuthentication fromAuthentication(Authentication authentication) {
        return (UserAuthentication) authentication.getPrincipal();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserAuthentication) {
            return super.getUsername().equals(((UserAuthentication) obj).getUsername());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.getUsername().hashCode();
    }
}

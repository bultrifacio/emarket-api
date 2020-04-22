package com.emarket.api.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import static java.util.Collections.emptyList;

public class JwtUtil {
    private JwtUtil(){
    }
    // Method to create the JWT and send it to the client in the response header
    static void addAuthentication(HttpServletResponse res, String username) {

        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + 1440000))
                .signWith(SignatureAlgorithm.HS512, "emarket")
                .compact();

        res.addHeader("Authorization", "Bearer " + token);
    }

    // Method to validate the token sent by the client
    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader("Authorization");

        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey("emarket")
                    .parseClaimsJws(token.replace("Bearer", ""))
                    .getBody()
                    .getSubject();
            return user != null ?
                    new UsernamePasswordAuthenticationToken(user, null, emptyList()) :
                    null;
        }
        return null;
    }
}

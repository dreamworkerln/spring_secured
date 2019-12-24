package com.marcosbarbero.lab.secured.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    // Basic auth example
    // Configuring in WebSecurityConfigurerAdapter.configure(HttpSecurity http)

    // Access secured resource with ROLE_ADMIN
    // curl -u admin:nooneguessthis -i localhost:9001/admin/who ; echo

    // Access non-secured resource with any(ROLE_ANONYMOUS)
    // curl -i localhost:9001/admin/ddt ; echo




    // curl -u clientId:secret  -X POST localhost:9001/oauth/token --data "grant_type=password&username=user&password=pass" ; echo
    // curl -u resource:respass -i localhost:9001/oauth/check_token --data "token=ACCESS_TOKEN" ; echo
    // curl -u clientId:secret  -i localhost:9001/oauth/token  --data "grant_type=refresh_token&refresh_token=REFRESH_TOKEN" ; echo
    // curl -u admin:nooneguessthis -i localhost:9001/admin/tokens/clientId ; echo



    

    // DOCS
    // https://www.baeldung.com/spring-security-oauth-revoke-tokens


    @GetMapping("/who")
    @Secured("ROLE_ADMIN")
    public ResponseEntity<Principal> get(final Principal principal) {
        return ResponseEntity.ok(principal);
    }



    @GetMapping("/ddt")
    //@Secured("ROLE_ADMIN")
    public ResponseEntity<String> ddt() {
        return ResponseEntity.ok("DDT");
    }

}



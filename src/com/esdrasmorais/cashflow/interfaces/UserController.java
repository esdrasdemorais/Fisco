
package com.esdrasmorais.cashflow.interfaces;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, path = "/login", produces = {
        MediaType.APPLICATION_JSON_VALUE
    }, consumes = {
        MediaType.APPLICATION_JSON_VALUE
    })
    public Response login(@Valid @RequestBody UserDto userDto) {
        userService.login(userDto);
        return new Response("OK");
    }
}

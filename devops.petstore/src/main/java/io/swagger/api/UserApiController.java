package io.swagger.api;

import io.swagger.model.Body3;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import java.util.List;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T06:26:34.006Z")

@Controller
public class UserApiController implements UserApi {



    public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true ) @RequestBody Body3 body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true ) @RequestBody List<Body4> body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true ) @RequestBody List<Body4> body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathVariable("username") String username) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Body4> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true ) @PathVariable("username") String username) {
        // do some magic!
        return new ResponseEntity<Body4>(HttpStatus.OK);
    }

    public ResponseEntity<String> loginUser( @NotNull @ApiParam(value = "The user name for login", required = true) @RequestParam(value = "username", required = true) String username,
         @NotNull @ApiParam(value = "The password for login in clear text", required = true) @RequestParam(value = "password", required = true) String password) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<Void> logoutUser() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Updated user object" ,required=true ) @RequestBody Body5 body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

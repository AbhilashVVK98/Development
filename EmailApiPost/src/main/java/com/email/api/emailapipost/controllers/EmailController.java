package com.email.api.emailapipost.controllers;

import com.email.api.emailapipost.model.EmailRequest;
import com.email.api.emailapipost.services.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {

    @Autowired
    private EmailServices emailServices;

    @GetMapping("/welcome")
public String welcome(){

        return "HI WELCOME TO API";
}
@RequestMapping(value="/sendmail",method= RequestMethod.POST)
public ResponseEntity<?> sendMail(@RequestBody EmailRequest request){
    boolean result =  this.emailServices.sendMailService(request.getSubject(),request.getSubject(),request.getTo());
    System.out.println(request);
   if(result){
      return  ResponseEntity.ok("EMAIL SENT SUCCESSFULLY .........");
   }
   else {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("EMAIL NOT SENT ......");
   }

}

}



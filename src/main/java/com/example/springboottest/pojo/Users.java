package com.example.springboottest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("users")
public class Users {
    int  id;
    String userName;
    String password;
    String head;
}

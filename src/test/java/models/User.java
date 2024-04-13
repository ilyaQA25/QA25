package models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String zipcode;
}

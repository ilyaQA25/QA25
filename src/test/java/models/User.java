package models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode(exclude = {"password", "zipcode"})
@ToString(exclude = {"password", "zipcode"})
public class User {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String zipcode;
}

//package com.infosys.account_service.model;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "account")
//@Getter
//@Setter
//public class Account {
//
//    @Id
//    @Column(length = 15)
//    private String name;
//
//    @Column(length = 15)
//    @NotBlank(message = "Password is mandatory")
//    private String password;
//
//    @Column(length = 15)
//    @Transient
//    private String confirmPassword;
//
//    @Column(length = 15, unique = true)
//    @Email(message = "Invalid email format")
//    private String email;
//
//}
package com.infosys.account_service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(length = 36, updatable = false, nullable = false)
    private String id;

    @Column(length = 50, nullable = false)
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column(length = 100, nullable = false)
    @NotBlank(message = "Password is mandatory")
    private String password;

    @Transient
    @NotBlank(message = "Confirm Password is mandatory")
    private String confirmPassword;

    @Column(length = 100, nullable = false, unique = true)
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    private String email;
}

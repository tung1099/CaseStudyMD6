package com.codegym.casestudymd6.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String avatar;

    private String phoneNumber;

    private Date birthDay;

    private String address;

    @OneToOne
    private User user;

}

package com.rahul.Entities;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity(name="user")
@Table(name="users")
@Setter
@Getter
@AllArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    @Column(name = "user_name",nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String phoneNumber;

    private boolean enabled =false;
    private boolean emailVerified=false;
    private boolean phoneNumberVerified=false;

    private Providers provider=Providers.SELF;
    private String providerUserId;


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true) // Use the imported CascadeType.ALL
    private List<Contact> contacts = new ArrayList<>();
    
   
}

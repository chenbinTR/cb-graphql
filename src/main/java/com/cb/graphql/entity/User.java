package com.cb.graphql.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String username;
    private String nickname;
    private City city;
}
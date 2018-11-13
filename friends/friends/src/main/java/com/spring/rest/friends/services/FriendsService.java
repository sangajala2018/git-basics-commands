package com.spring.rest.friends.services;

import org.springframework.data.repository.CrudRepository;

import com.spring.rest.friends.model.Friend;

public interface FriendsService extends CrudRepository<Friend, Integer>{

}

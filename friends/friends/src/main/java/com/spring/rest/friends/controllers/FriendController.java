package com.spring.rest.friends.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.friends.model.Friend;
import com.spring.rest.friends.services.FriendsService;

@RestController
public class FriendController {
 @Autowired
  FriendsService friendService;
 @PostMapping("/friend")
 Friend create(@RequestBody Friend friend) {
	 return friendService.save(friend);
 }
 @GetMapping("/friend")
 Iterable<Friend> read(){
 return friendService.findAll();
 }
 @PutMapping("/friend")
 Friend update(@RequestBody Friend friend) {
	 return friendService.save(friend);
 }
 @DeleteMapping("/friend/{id}")
 void delete(@PathVariable Integer id) {
	 friendService.deleteById(id);
 }
}

package com.sozkan.friendsdemo.controller;

import com.sozkan.friendsdemo.entity.Friends;
import com.sozkan.friendsdemo.service.FriendsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class FriendsController {

    private FriendsService friendsService;

    public FriendsController(FriendsService friendsService) {
        this.friendsService = friendsService;
    }

    @GetMapping
    public List<Friends> getAllFriends(){
        return friendsService.getFriends();
    }
}
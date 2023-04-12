package com.sozkan.friendsdemo.service.Impl;

import com.sozkan.friendsdemo.entity.Friends;
import com.sozkan.friendsdemo.repository.FriendsRepository;
import com.sozkan.friendsdemo.service.FriendsService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsServiceImpl implements FriendsService {
    private FriendsRepository friendsRepository;

    public FriendsServiceImpl(FriendsRepository friendsRepository) {
        this.friendsRepository = friendsRepository;
    }

    @Override
    public List<Friends> getFriends() {
        return friendsRepository.findAll();
    }
}
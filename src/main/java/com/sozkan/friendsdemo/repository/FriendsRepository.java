package com.sozkan.friendsdemo.repository;

import com.sozkan.friendsdemo.entity.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<Friends, Long> {


}
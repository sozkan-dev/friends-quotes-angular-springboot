package com.sozkan.friendsdemo.util;

import com.sozkan.friendsdemo.entity.Friends;
import com.sozkan.friendsdemo.repository.FriendsRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoad implements ApplicationRunner {
    private FriendsRepository friendsRepository;

    public DataLoad(FriendsRepository friendsRepository) {
        this.friendsRepository = friendsRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Friends friends1 = Friends.builder()
                                  .character("Ross")
                                  .quote("Pivot! Pivot! Pivot! Pivot! Pivot!")
                                  .build();
        Friends friends2 = Friends.builder()
                                  .character("Joey")
                                  .quote("Joey doesn't share food!")
                                  .build();
        Friends friends3 = Friends.builder()
                                  .character("Monica")
                                  .quote("Guys can fake it? Unbelievable! The one thing that’s ours!")
                                  .build();
        Friends friends4 = Friends.builder()
                                  .character("Joey")
                                  .quote("It's a moo point. It's like a cow's opinion; it doesn't matter. It's moo.")
                                  .build();
        Friends friends5 = Friends.builder()
                                  .character("Joey")
                                  .quote("Yeah, that's right. I stepped up! She's my friend and she needed help. And if I have to I'd pee on any one of you.")
                                  .build();
        Friends friends6 = Friends.builder()
                                  .character("Phoebe")
                                  .quote("But they don't know that we know they know we know!")
                                  .build();
        Friends friends7 = Friends.builder()
                                  .character("Phoebe")
                                  .quote("This is brand-new information!")
                                  .build();
        Friends friends8 = Friends.builder().character("Ross").quote("Unagi.").build();

        friendsRepository.save(friends1);
        friendsRepository.save(friends2);
        friendsRepository.save(friends3);
        friendsRepository.save(friends4);
        friendsRepository.save(friends5);
        friendsRepository.save(friends6);
        friendsRepository.save(friends7);
        friendsRepository.save(friends8);



    }
}
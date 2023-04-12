package com.sozkan.friendsdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "friends_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Friends {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friends_id")
    private Long id;
    @Column(name = "friends_character")
    private String character;
    @Column(name = "character_quote")
    private String quote;


}
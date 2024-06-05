package com.ll.chat_2024_06_03.domain.chat.chatRoom.entity;

import com.ll.chat_2024_06_03.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder // BaseEntity에서 상속 받으면 이 어노테이션을 달아줘야함
@Getter
@Setter
@ToString(callSuper = true)
public class ChatRoom extends BaseEntity {

    @Getter
    private String name;

    @Getter
    @OneToMany(mappedBy = "chatRoom", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    @ToString.Exclude
    private List<ChatMessage> chatMessages = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public ChatMessage writeMessage(String writerName, String content) {
        ChatMessage chatMessage = ChatMessage
                .builder()
                .chatRoom(this)
                .writerName(writerName)
                .content(content)
                .build();
        chatMessages.add(chatMessage);
        return chatMessage;
    }
}

package com.ll.chat_2024_06_03.domain.chat.chatMessage.entity;

import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chat_2024_06_03.global.jpa.baseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder // BaseEntity에서 상속 받으면 이 어노테이션을 달아줘야함
@Getter
@Setter
@ToString(callSuper = true)
public class ChatMessage extends BaseEntity {

    @ManyToOne
    private ChatRoom chatRoom;

    @Getter
    private String writerName;

    @Getter
    private String content;

}

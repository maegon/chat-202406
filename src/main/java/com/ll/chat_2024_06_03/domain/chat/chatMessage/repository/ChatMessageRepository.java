package com.ll.chat_2024_06_03.domain.chat.chatMessage.repository;

import com.ll.chat_2024_06_03.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
    List<ChatMessage> findByChatRoomAndIdAfter(Long roomId, long afterId);
}

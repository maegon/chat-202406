package com.ll.chat_2024_06_03.domain.chat.chatRoom.controller;

import lombok.Builder;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 이걸 활용해서 종류별 차트 구분 가능하겠는 걸?
@Controller
public class chatRoomController {
    @GetMapping("/chat/room/{roomId}")
    @ResponseBody
    public String showRoom(
            @PathVariable("roomId") final long roomId,
            @RequestParam(value = "writerName", defaultValue = "NoName") final String writerName
    ) {
        return "%d번 채팅방 입니다. writer : %s".formatted(roomId, writerName);
    }
}

package cn.loach.server.message.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class SingleChatResponseMessage extends ResponseMessage{
    /**
     * 数据体
     */
    private String content;

    /**
     * 发送者
     */
    private String fromId;

    /**
     * 接收者
     */
    private String toId;

    public SingleChatResponseMessage() {
        setMessageRequestTypeType(SINGLE_CHAT_MESSAGE_RESPONSE_TYPE);
    }
}

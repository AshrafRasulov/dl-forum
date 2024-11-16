package com.forum.forumnew.View.Response;

import lombok.Builder;
import lombok.Data;
import java.sql.Timestamp;

@Data
@Builder
public class MessageResponse {
    private Long id;
    private Long user_id;
    private Long  post_id;
    private String content;
    private Timestamp created;
    private Long status;
}

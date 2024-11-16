package com.forum.forumnew.View;

import com.forum.forumnew.Utils.ActionEnum;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class LogUserResponse {
    private Long id;
    private Long created_by;
    private Long user_id;
    private Timestamp created;
    private ActionEnum action;
    private String body;
}

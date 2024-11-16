package com.forum.forumnew.View.Response;

import com.forum.forumnew.Utils.ActionEnum;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class LogPostResponse {
    private Long id;
    private Long created_by;
    private Long post_id;
    private Timestamp created;
    private ActionEnum action;
    private String body;
}

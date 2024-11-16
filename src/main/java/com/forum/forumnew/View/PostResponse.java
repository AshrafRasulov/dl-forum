package com.forum.forumnew.View;


import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class PostResponse {
    private Long id;
    private Long user_id;
    private String title;
    private String content;
    private Timestamp created;
    private Long category_id;
    private Boolean status;
    private Boolean is_admin;
}

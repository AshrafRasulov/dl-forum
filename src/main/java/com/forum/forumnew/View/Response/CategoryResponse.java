package com.forum.forumnew.View.Response;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class CategoryResponse {
    private Long id;
    private Long user_id;
    private String name;
    private String slug;
    private Timestamp created;
    private Boolean status;
}

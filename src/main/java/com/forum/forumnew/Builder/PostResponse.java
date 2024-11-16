package com.forum.forumnew.Builder;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class PostResponse {
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime created;
    private Long categoryId;
    private String status;


}

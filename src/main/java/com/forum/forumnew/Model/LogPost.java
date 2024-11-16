package com.forum.forumnew.Model;

import com.forum.forumnew.Utils.ActionEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "FORUM_LOG_POSTS")
public class LogPost {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long created_by;

    @Column(nullable = false)
    private Long post_id;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp created;

    @Enumerated(EnumType.STRING)
    private ActionEnum action;

    @Column(columnDefinition = "CLOB")
    private String body;

}

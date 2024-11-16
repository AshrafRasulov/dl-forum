package com.forum.forumnew.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table()
public class User {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;

    @Column(nullable = false)
    private String middle_name;

    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp created;


    @Column(nullable = false)
    private Boolean status;


    @Column(nullable = false)
    private Boolean is_admin;

    //    @Column(columnDefinition="tinyint(1) default 1")

//    Relations
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private Post post;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")

    @JoinColumn(name = "user_id")
    private List<Post> posts;

}

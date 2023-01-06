package com.bdbt_project.ClientAPP;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="POCZTY")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NR_POCZTY")
    private Integer Post_Id;

    @Column(name = "KOD_POCZTOWY"
            )
    private String Post_code;

    @Column(name = "POCZTA"
    )
    private String Post_str;

    @OneToOne(mappedBy = "post")
    private Adress adress;

    @OneToOne(mappedBy = "post")
    private Managment managment;

    public Post(Integer post_Id, String post_code, String post_str) {
        super();
        this.Post_Id = post_Id;
        this.Post_code = post_code;
        this.Post_str = post_str;
    }
}

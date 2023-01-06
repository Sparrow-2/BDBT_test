package com.bdbt_project.ClientAPP;

import javax.persistence.*;
import java.util.List;

@Entity (name = "ZARZADY")
public class Managment {
    @Id
    @Column(name = "NR_ZARZADU")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Managment_id;

    @Column(
            name="DATA_ZALOZENIA")//,
            //updatable = false,
            //nullable = false, columnDefinition = "TEXT")
    private String begginig_date;

    @Column(
            name="NAZWA_ZARZADU")//,
            //updatable = true,
            //nullable = false, columnDefinition = "TEXT")
    private String managment_name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NR_ADRESU")
    private Adress adress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NR_POCZTY")
    private Post post;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "NR_ZARZADU", referencedColumnName = "NR_ZARZADU")
    private List <Employee> workers;




}

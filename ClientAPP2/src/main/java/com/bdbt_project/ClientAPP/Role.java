package com.bdbt_project.ClientAPP;

import javax.persistence.*;
import java.util.List;
@Entity(name = "STANOWISKA")
@Table(name = "STANOWISKA")
public class Role {
    @Id
    @Column(name = "NR_STANOWISKA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Role_id;


    @Column(
            name="NAZWA_STANOWISKA")// ,
            //updatable = true,
            //nullable = false, columnDefinition = "TEXT")
    private String Role_name;

    @Column(
            name="OPIS_STANOWISKA")//,
            //updatable = true,
            //nullable = false, columnDefinition = "TEXT")
    private String Role_description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "NR_STANOWISKA", referencedColumnName = "NR_STANOWISKA")
    private List<Employee> workers;

}




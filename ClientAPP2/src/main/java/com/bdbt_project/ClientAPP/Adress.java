package com.bdbt_project.ClientAPP;

import javax.persistence.*;

@Entity(name = "ADRESY")
@Table(name = "ADRESY")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NR_ADRESU")
    private Integer addresId;

    @Column(
            name="MIASTO"
           )
    private String city;

    @Column(
            name="NR_DOMU"
            )
    private String house_number;
    @Column(
            name="NR_LOKALU"
        )
    private String flat_number;
    @Column(
            name="ULICA"
            )
    private String street;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NR_POCZTY")
    private Post post;

    @OneToOne(mappedBy = "adress")
    private Managment managment;

    @OneToOne(mappedBy = "adress_id")
    private Employee worker;






}

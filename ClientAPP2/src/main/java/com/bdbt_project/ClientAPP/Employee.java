package com.bdbt_project.ClientAPP;

import javax.persistence.*;

@Entity(name = "PRACOWNICY")
@Table(name = "PRACOWNICY")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name="NR_PRACOWNIKA"


    )
    private Integer id;
    @Column(
            name="DATA_WAZNOSCI_BADAN"


    )
    private String date_of_valid_test;
    @Column(
            name="DATA_URODZENIA_PRACOWNIKA"


    )
    private String birth_date;
    @Column(
            name="DATA_BADANIA"


    )
    private String date_of_last_test;
    @Column(
            name="DATA_ZATRUDNIENIA"


    )
    private String date_of_employment;
    @Column(
            name="DATA_ZWOLNIENIA"

    )
    private String date_of_examption;

    @Column(
            name="EMAIL_PRACOWNIKA"


    )
    private String email;
    @Column(
            name="IMIE_PRACOWNIKA"

    )
    private String name;
    @Column(
            name="NAZWISKO_PRACOWNIKA"


    )
    private String lastname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "NR_ADRESU", referencedColumnName = "NR_ADRESU")
    private Adress adress_id = new Adress();
    @Column(
            name="NR_KONTA"


    )
    private String bank_account_number;

    @OneToOne
    @JoinColumn(name = "NR_POCZTY", referencedColumnName = "NR_POCZTY")
    private Post post;

    @Column(
            name="NR_STANOWISKA"


    )
    private Integer role_id;


    @Column(
            name="NR_TELEFONU_PRACOWNIKA"


    )
    private String phone_number;


    //@ManyToOne
    //@JoinColumn
    //private Integer managmnet_id;
    @Column(
            name="PESEL_PRACOWNIKA"


    )
    private String pesel;
    @Column(
            name="PLEC_PRACOWNIKA"


    )
    private Character sex;


    public Employee(Integer id, String date_of_valid_test, String birth_date, String date_of_last_test, String date_of_employment, String date_of_examption, String email, String name, String lastname, Adress adress_id, String bank_account_number, Post post, Integer role_id, String phone_number, Integer managmnet_id, String pesel, Character sex) {
        this.id = id;
        this.date_of_valid_test = date_of_valid_test;
        this.birth_date = birth_date;
        this.date_of_last_test = date_of_last_test;
        this.date_of_employment = date_of_employment;
        this.date_of_examption = date_of_examption;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.adress_id = adress_id;
        this.bank_account_number = bank_account_number;
        this.post = post;
        this.role_id = role_id;
        this.phone_number = phone_number;

        this.pesel = pesel;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate_of_valid_test() {
        return date_of_valid_test;
    }

    public void setDate_of_valid_test(String date_of_valid_test) {
        this.date_of_valid_test = date_of_valid_test;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getDate_of_last_test() {
        return date_of_last_test;
    }

    public void setDate_of_last_test(String date_of_last_test) {
        this.date_of_last_test = date_of_last_test;
    }

    public String getDate_of_employment() {
        return date_of_employment;
    }

    public void setDate_of_employment(String date_of_employment) {
        this.date_of_employment = date_of_employment;
    }

    public String getDate_of_examption() {
        return date_of_examption;
    }

    public void setDate_of_examption(String date_of_examption) {
        this.date_of_examption = date_of_examption;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Adress getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(Adress adress_id) {
        this.adress_id = adress_id;
    }

    public String getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(String bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", date_of_valid_test='" + date_of_valid_test + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", date_of_last_test='" + date_of_last_test + '\'' +
                ", date_of_employment='" + date_of_employment + '\'' +
                ", date_of_examption='" + date_of_examption + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adress_id=" + adress_id +
                ", bank_account_number='" + bank_account_number + '\'' +
                ", post=" + post +
                ", role_id=" + role_id +
                ", phone_number='" + phone_number + '\'' +
                ", pesel='" + pesel + '\'' +
                ", sex=" + sex +
                '}';
    }
}

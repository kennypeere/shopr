package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = User.FIND_BY_NAME,
                        query = "SELECT u FROM User u WHERE u.name = :name"
                ),
                @NamedQuery(
                        name = User.FIND_ALL,
                        query = "SELECT u FROM User u"
                )
        }
)
public class User {
    public static final String FIND_ALL = "User.findAll";
    public static final String FIND_BY_NAME = "User.findByName";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "first_name")
    private String firstName;
    @ManyToMany
    private List <Beoordeling> beoordelingen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

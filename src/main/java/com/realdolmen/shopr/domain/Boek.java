package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@NamedQueries({
        @NamedQuery(name = Boek.FIND_ALL_BOOKS,
        query = "select b from Boek b")
})
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "boek_type")
@DiscriminatorValue(value = "boek")
public abstract class Boek extends Artikel
{
    public static final String FIND_ALL_BOOKS = "Boek.findall";
    @Size(max=100)
    @Column
    private String auteur;
    @NotNull
    @Column
    private String isbn;
    @Column
    private int aantalPaginas;




    public String getAuteur()
    {
        return auteur;
    }

    public void setAuteur(String auteur)
    {
        this.auteur = auteur;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getAantalPaginas()
    {
        return aantalPaginas;
    }

    public void setAantalPaginas(int aantalPaginas)
    {
        this.aantalPaginas = aantalPaginas;
    }
}

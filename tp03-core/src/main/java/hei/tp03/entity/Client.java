package hei.tp03.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Anaïck on 21/01/2017.
 */

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="prenom")
    private String prenom;
    @Column(name="nom", nullable=false)
    private String nom;
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="client")
    private List<Commande> commandes;

    public Client(){}

    public Client(String nom, String prenom){
        nom = nom;
        prenom = prenom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}

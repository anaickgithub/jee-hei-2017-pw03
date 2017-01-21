package hei.tp03.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Anaïck on 21/01/2017.
 */
@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade={CascadeType.ALL}, mappedBy="commande")
    private List<Produit> produits;
    @Column(name="validee")
    private boolean validee;
    @ManyToOne
    private Client client;

    public Commande(){}

    public Commande(Client client){
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public boolean isValidee() {
        return validee;
    }

    public void setValidee(boolean validee) {
        this.validee = validee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

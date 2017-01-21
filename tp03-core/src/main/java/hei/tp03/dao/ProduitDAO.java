package hei.tp03.dao;

import hei.tp03.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Anaïck on 21/01/2017.
 */
public interface ProduitDAO extends JpaRepository<Produit,Long> {
}

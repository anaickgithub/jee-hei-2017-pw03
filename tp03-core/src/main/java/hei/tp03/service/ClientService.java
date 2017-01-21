package hei.tp03.service;

import hei.tp03.entity.Client;

import java.util.List;

/**
 * Created by Anaïck on 21/01/2017.
 */
public interface ClientService {

    List<Client> findByNom(String nom);
    void saveClient(Client client);
    List<Client> findAll();
}

package hei.tp03.controller;

import hei.tp03.config.AppConfig;
import hei.tp03.entity.Client;
import hei.tp03.service.ClientService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Anaïck on 21/01/2017.
 */
public class ClientServlet extends HttpServlet {

    private ClientService clientService;
    private ConfigurableApplicationContext context;

    public void init(){
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        clientService = context.getBean(ClientService.class);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        List<Client> listeClient = clientService.findAll();
        for (Client client:listeClient)
            out.println("Client: "+client.getId()+", "+client.getNom()+", "+client.getPrenom());
    }

    public void destroy(){
        context.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acsh122.emp.backingbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;
import uk.ac.city.acsh122.emp.domian.Client;
import uk.ac.city.acsh122.emp.services.EmpManagementService;

/**
 *
 * @author Sarath
 */
@ManagedBean (name="findClientByNameBean")
public class FindClientByNameBean {
    
    @EJB
    private EmpManagementService service;
    @Size(min=1, max=20, message="Minimun of 1 character and Maximum of 20 characters required for Client")
    private String name;
    private Client client;
    
    public String findClientByName(){
        client = service.findClientByName(name);
        return "displayclient";
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

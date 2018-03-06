package uk.ac.city.acsh122.emp.domian;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.ac.city.acsh122.emp.domian.Assignment;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-10T15:34:47")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Short> clientID;
    public static volatile SingularAttribute<Client, String> address;
    public static volatile SingularAttribute<Client, String> name;
    public static volatile SingularAttribute<Client, String> contactNumber;
    public static volatile SingularAttribute<Client, String> contactPerson;
    public static volatile CollectionAttribute<Client, Assignment> assignmentCollection;

}
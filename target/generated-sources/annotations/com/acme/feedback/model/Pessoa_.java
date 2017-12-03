package com.acme.feedback.model;

import com.acme.feedback.model.Cargo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-03T05:43:11")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> fotoUrl;
    public static volatile SingularAttribute<Pessoa, Date> nascimento;
    public static volatile SingularAttribute<Pessoa, String> bio;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, String> sobrenome;
    public static volatile SingularAttribute<Pessoa, Cargo> cargo;
    public static volatile SingularAttribute<Pessoa, String> email;

}
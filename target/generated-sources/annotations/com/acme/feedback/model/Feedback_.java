package com.acme.feedback.model;

import com.acme.feedback.model.Pessoa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-03T19:22:34")
@StaticMetamodel(Feedback.class)
public class Feedback_ { 

    public static volatile SingularAttribute<Feedback, String> texto;
    public static volatile SingularAttribute<Feedback, Integer> positivo;
    public static volatile SingularAttribute<Feedback, Pessoa> pessoa;
    public static volatile SingularAttribute<Feedback, Integer> negativo;
    public static volatile SingularAttribute<Feedback, Date> dataPublicacao;
    public static volatile SingularAttribute<Feedback, Long> id;

}
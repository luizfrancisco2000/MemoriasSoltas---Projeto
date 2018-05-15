/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memories.Servelet.GrupoServelet;

import Memories.Hibernate.HibernateFactory;
import Memories.Models.Grupo;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Chico
 */
public class ConsultaGrupo {

    public static Grupo findById(String id) {
        Session s = HibernateFactory.getSessionFactory().openSession();
        return s.get(Grupo.class, id);
    }
        public static List<Grupo> returnList(String pessoa) {
        Session s = HibernateFactory.getSessionFactory().openSession();
        Query query = (Query) s.createQuery("from Grupo v");
        query.setParameter("pessoa", pessoa);
        return query.getResultList();
    }
    public static String returnValues(Grupo v) {
        String a = "";
        a += v.getId() + "#";
        /*a += v.getNome() + "#";
        a += v.getDescricao() + "#";
        a += v.getEstabelecimento().getSufixoCNPJ()+ "#";*/
        return a;
    }
}

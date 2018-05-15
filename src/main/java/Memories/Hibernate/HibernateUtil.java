package Memories.Hibernate;

import Memories.Interfaces.InterfaceDAO;
import org.hibernate.Session;

/**
 *
 * @author Pedro
 * @param <T>
 */
public class HibernateUtil<T> implements InterfaceDAO<T> {

    private Session session;
    private String message = "";

    @Override
    public String salvar(T classe) {
        session =  HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(classe);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }

    @Override
    public String deletar(T classe) {
        session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            this.session.flush();
            this.session.clear();
            session.delete(classe);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }

    @Override
    public String atualizar(T classe) {
        session =HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(classe);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            message = e.getMessage();
        } finally {
            session.close();
        }
        return message;
    }

}

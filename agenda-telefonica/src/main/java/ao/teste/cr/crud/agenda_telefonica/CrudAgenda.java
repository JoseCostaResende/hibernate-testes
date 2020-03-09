package ao.teste.cr.crud.agenda_telefonica;

import ao.teste.cr.agenda.telefonica.Agenda;
import java.sql.Timestamp;
import java.text.ParseException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 2020.02.24 5:14:34 AM UTF-8
 *
 * @author Jotajota Costa Resende [JJ at bpc.ao] agenda-telefonica
 */
public class CrudAgenda
{

    public static void main(String[] args) throws ParseException
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ao.cr_agenda-telefonica_jar_0.1PU");
        EntityManager em = emf.createEntityManager();

        Agenda agenda = new Agenda();

//»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»        INSERIR        »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»
//
//        agenda.setNome("Miguel Vieira");
//        agenda.setTelefone("923123123");
//        agenda.setDataRegisto(new Date());
//
//        em.getTransaction().begin();
//        em.persist(agenda);
//        em.getTransaction().commit();
//
//        System.out.println("Registo Salvo com Sucesso..!");
//»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»        FIND        »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»
//       String pattern = "MMM dd, yyyy HH:mm:ss.SSSSSSSS";
//        String timestampAsString = "2020-02-24 05:44:27.9910";
//        Timestamp timestamp = Timestamp.valueOf(timestampAsString);
//
//        System.err.println(timestamp);
//        agenda = em.find(Agenda.class, timestamp);
//        System.out.println("agenda = " + agenda);
//»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»        UPDATE        »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»
//        em.getTransaction().begin();
//        agenda.setNome("Joao Carlos Abadia");
//        em.getTransaction().commit();
//
//        System.out.println("agenda = " + agenda);
//»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»        REMOV        »»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»
        String timestampAsString = "2020-02-24 05:42:58.078";
        Timestamp timestamp = Timestamp.valueOf(timestampAsString);
        agenda = em.find(Agenda.class, timestamp);

        em.getTransaction().begin();
        em.remove(agenda);
        em.getTransaction().commit();

    }

}

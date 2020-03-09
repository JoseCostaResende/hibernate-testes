package ao.teste.cr.agenda.telefonica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 2020.02.24 5:07:28 AM UTF-8
 *
 * @author Jotajota Costa Resende [JJ at bpc.ao] agenda-telefonica
 */
@Entity//(name = "agenda", catalog = "agenda_telefonica", schema = "public")
public class Agenda
{

    private String nome;
    private String telefone;
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRegisto;
//    private String morada = "Bairo Marçal";

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public Date getDataRegisto()
    {
        return dataRegisto;
    }

    public void setDataRegisto(Date dataRegisto)
    {
        this.dataRegisto = dataRegisto;
    }

    @Override
    public String toString()
    {
        return "Agenda{" + "nome=" + nome + ", telefone=" + telefone + ", dataRegisto=" + dataRegisto + '}';
    }

}

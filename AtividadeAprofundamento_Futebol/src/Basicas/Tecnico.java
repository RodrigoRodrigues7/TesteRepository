package Basicas;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Tecnico extends Pessoa {

    @OneToOne(mappedBy = "tecnico")
    @Cascade(CascadeType.ALL)
    private Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time nomeTime) {
        this.time = nomeTime;
    }

}

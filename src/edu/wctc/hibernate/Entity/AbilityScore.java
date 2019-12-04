package edu.wctc.hibernate.Entity;


import javax.persistence.*;

@Entity
@Table(name = "AbilityScore")
public class AbilityScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="Ability")
    private String Ability;

    public AbilityScore() {
    }

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getAbility() {        return Ability;    }

    public void setAbility(String ability) {        Ability = ability;    }

    @Override
    public String toString(){
        return "AbilityScore: " + this.Ability + "||ID: " + this.id;
    }
}

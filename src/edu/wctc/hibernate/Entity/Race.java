package edu.wctc.hibernate.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Speed")
    private int speed;

    public Race() {
    }

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getName() {        return name;    }

    public void setName(String name) {        this.name = name;    }

    public int getSpeed() {        return speed;    }

    public void setSpeed(int speed) {        this.speed = speed;    }

    @Override
    public String toString(){
        return this.id + "|| " + this.name + " Speed: " + speed;
    }
}

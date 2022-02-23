package io.github.mat3e.hello.lang;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class Lang {
    @Id
    @GeneratedValue(generator="inc")
    @GenericGenerator(name="inc", strategy = "increment")
    private Integer id;
    @Column(name="welcomensg")
    private String welcomeMsg;
    private String code;

    public Lang(Integer id, String welcomeMsg, String code) {
        this.id = id;
        this.welcomeMsg = welcomeMsg;
        this.code = code;
    }

    @SuppressWarnings("unused")
    public Lang() {
//        Hibernate (JPA) needs it
    }

    public Integer getId() {
        return id;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

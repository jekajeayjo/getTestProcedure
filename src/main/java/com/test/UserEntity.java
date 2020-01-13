package com.test;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getPass",
                procedureName = "getpass",
                resultClasses = UserEntity.class)
})
public class UserEntity  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

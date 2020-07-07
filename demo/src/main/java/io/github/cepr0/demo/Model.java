package io.github.cepr0.demo;

import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Data
@Entity
public class Model {
    @Id private Integer id;
    @Version private Short version;
    private String name;

    @Tolerate
    public Model(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

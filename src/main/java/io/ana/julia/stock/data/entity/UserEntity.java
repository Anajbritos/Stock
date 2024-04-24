package io.ana.julia.stock.data.entity;

import io.ana.julia.stock.data.dto.UserDtoType;
import jakarta.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "document")
    private String cpf;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "User_TYPE")
    private UserEntityType userEntityType;

    public UserEntity() {
    }

    public UserEntity(
            Long id,
            String name,
            String cpf,
            String email,
            String password,
            UserEntityType userEntityType) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.userEntityType = userEntityType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUserDtoType(UserEntityType userEntityType) {
        this.userEntityType = userEntityType;
    }

    public UserEntityType getUserEntityType() {
        return this.userEntityType;
    }
}

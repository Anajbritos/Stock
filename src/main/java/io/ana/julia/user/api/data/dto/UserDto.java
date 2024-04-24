package io.ana.julia.user.api.data.dto;

public class UserDto {
    private Long id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private UserDtoType userDtoType;

    public UserDto() {

    }

    public UserDto(
            Long id,
            String name,
            String cpf,
            String email,
            String password,
            UserDtoType userDtoType) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.userDtoType = userDtoType;
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

    public void setUserDtoType(UserDtoType userDtoType) {
        this.userDtoType = userDtoType;
    }

    public UserDtoType getUserDtoType() {
        return this.userDtoType;
    }
}

package com.wit.unifesta.data.dto;

import java.util.Objects;

public class UserResponseDTO {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String sns;

    public UserResponseDTO() {
    }

    public UserResponseDTO(Long id, String username, String password, String email, String sns) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.sns = sns;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSns() {
        return sns;
    }

    public void setSns(String sns) {
        this.sns = sns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserResponseDTO)) return false;
        UserResponseDTO that = (UserResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email);
    }
}

package com.wit.unifesta.dto;

public class UserDto {

    private int id;             // 회원 일련번호
    private String username;    // 로그인 아이디
    private String password;    // 비밀번호
    private String email;       // 이메일
    private String sociallogin; // 소셜 로그인
    private String likedlist;   // 찜한 학교 목록

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSociallogin() {
        return sociallogin;
    }

    public String getLikedlist() {
        return likedlist;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSociallogin(String sociallogin) {
        this.sociallogin = sociallogin;
    }

    public void setLikedlist(String likedlist) {
        this.likedlist = likedlist;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", sociallogin='" + sociallogin + '\'' +
                ", likedlist='" + likedlist + '\'' +
                '}';
    }
}

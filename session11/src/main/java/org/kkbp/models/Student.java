package org.kkbp.models;

import java.util.Objects;

public class Student {
    private String cif;
    private String names;
    private String lastnames;
    private String email;
    private String telephone;

    public Student() {
    }

    public Student(String cif, String names, String lastnames, String email, String telephone) {
        this.cif = cif;
        this.names = names;
        this.lastnames = lastnames;
        this.email = email;
        this.telephone = telephone;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cif='" + cif + '\'' +
                ", names='" + names + '\'' +
                ", lastnames='" + lastnames + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(cif, student.cif) && Objects.equals(names, student.names) && Objects.equals(lastnames, student.lastnames) && Objects.equals(email, student.email) && Objects.equals(telephone, student.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, names, lastnames, email, telephone);
    }
}

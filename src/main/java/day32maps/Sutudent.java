package day32maps;

public class Sutudent {


    public String name;
    public Integer idNo;
    public String email;
    public Integer note;

    public Sutudent(String name, Integer idNo, String email, Integer note) {
        this.name = name;
        this.idNo = idNo;
        this.email = email;
        this.note = note;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", idNo=" + idNo +
                ", email='" + email + '\'' +
                ", note=" + note +
                '}';
    }
}

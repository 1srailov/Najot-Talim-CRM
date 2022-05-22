package nt.crm.NajotTalimCRM.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(generator = "teachers_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
    private List<Course> courses;
}

package nt.crm.NajotTalimCRM.DAO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pupils")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pupil{
    @Id
    @GeneratedValue(generator = "pupils_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;


}

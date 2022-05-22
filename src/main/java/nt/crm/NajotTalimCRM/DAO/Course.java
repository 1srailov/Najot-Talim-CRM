package nt.crm.NajotTalimCRM.DAO;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {

    @Id
    @GeneratedValue(generator = "courses_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String courseName;

    @Column(name = "start_at")
    private String startAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private List<Pupil> pupils;

    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;

}

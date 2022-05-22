package nt.crm.NajotTalimCRM.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "lessons")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "date")
    private Date date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lesson")
    private List<PupilAssessment> assessments;
}
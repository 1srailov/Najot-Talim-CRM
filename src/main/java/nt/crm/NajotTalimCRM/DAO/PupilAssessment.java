package nt.crm.NajotTalimCRM.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pupils_assessments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PupilAssessment {
    @Id
    @GeneratedValue(generator = "courses_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "pupil_id")
    private Integer pupilId;

    @Column(name = "assessment")
    private Integer assessment;

    @Column(name = "date")
    private Date date;

    @Column(name = "comments")
    private String comment;

    @Column(name = "rating_color")
    private String ratingColor;

    @Column(insertable = false, updatable = false, name = "lesson_id")
    private Integer lessonId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Lesson lesson;
}

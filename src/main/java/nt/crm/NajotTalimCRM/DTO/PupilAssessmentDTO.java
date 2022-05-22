package nt.crm.NajotTalimCRM.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import nt.crm.NajotTalimCRM.DAO.Lesson;

import java.sql.Date;

@Data
@AllArgsConstructor
public class PupilAssessmentDTO{
    private final Integer id;

    private final Integer pupilId;

    private final Integer assessment;

    private final Date date;

    private final String comment;

    private final String ratingColor;

    private final Integer lessonId;

    private LessonDTO lessonDTO;
}

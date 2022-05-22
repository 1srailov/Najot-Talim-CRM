package nt.crm.NajotTalimCRM.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.PupilAssessment;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class LessonDTO{
    private final Integer id;
    private final Integer courseId;
    private final Date date;
    private List<PupilAssessmentDTO> assessmentsDTOS;
}

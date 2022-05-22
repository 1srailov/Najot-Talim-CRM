package nt.crm.NajotTalimCRM.mapping;


import nt.crm.NajotTalimCRM.DAO.PupilAssessment;
import nt.crm.NajotTalimCRM.DTO.PupilAssessmentDTO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PupilAssessmentMapping {

    public static PupilAssessmentDTO toDTO(PupilAssessment pupilAssessment) {
        if (pupilAssessment != null) {
//            pupilAssessment.getLesson().setAssessments(null);
            return new PupilAssessmentDTO(pupilAssessment.getId(), pupilAssessment.getPupilId(), pupilAssessment.getAssessment(),
                    pupilAssessment.getDate(), pupilAssessment.getComment(), pupilAssessment.getRatingColor(), pupilAssessment.getLessonId(), LessonMapping.toDTO(pupilAssessment.getLesson()));
        }
        return null;
    }
    public static PupilAssessment toEntity(PupilAssessmentDTO pupilAssessmentDTO){
        return new PupilAssessment(null, pupilAssessmentDTO.getPupilId(), pupilAssessmentDTO.getAssessment(),
                new Date(Calendar.getInstance().getTime().getTime()), pupilAssessmentDTO.getComment(), pupilAssessmentDTO.getRatingColor(), pupilAssessmentDTO.getLessonId(), null);
    }

    public static List<PupilAssessmentDTO> toDTOS(List<PupilAssessment> assessments) {
        if(assessments == null){
            return null;
        }
        List<PupilAssessmentDTO> assessmentDTOS = new ArrayList<>();
        for(PupilAssessment p : assessments){
            assessmentDTOS.add(toDTO(p));
        }
        return assessmentDTOS;
    }
}

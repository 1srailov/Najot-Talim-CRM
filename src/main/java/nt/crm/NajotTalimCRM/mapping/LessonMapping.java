package nt.crm.NajotTalimCRM.mapping;

import nt.crm.NajotTalimCRM.DAO.Lesson;
import nt.crm.NajotTalimCRM.DTO.LessonDTO;

import java.sql.Date;
import java.util.Calendar;

public class LessonMapping {

    public static Lesson toEntity(LessonDTO lessonDto){
        return lessonDto == null ? null :
                new Lesson(null, lessonDto.getId(), new Date(Calendar.getInstance().getTime().getTime()), null);
    }

    public static Lesson toEntity(Integer id){
        return new Lesson(null, id, new Date(Calendar.getInstance().getTime().getTime()), null);
    }

    public static LessonDTO toDTO(Lesson lesson) {
        if(lesson == null){
            return null;
        }
        return new LessonDTO(lesson.getId(), lesson.getCourseId(), lesson.getDate(), PupilAssessmentMapping.toDTOS(lesson.getAssessments()));
    }
}

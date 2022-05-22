package nt.crm.NajotTalimCRM.SERVICE;


import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Course;
import nt.crm.NajotTalimCRM.DAO.Lesson;
import nt.crm.NajotTalimCRM.DTO.CourseDTO;
import nt.crm.NajotTalimCRM.DTO.LessonDTO;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.REPOSITORY.CourseRepository;
import nt.crm.NajotTalimCRM.REPOSITORY.LessonRepository;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseCode;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseMessages;
import nt.crm.NajotTalimCRM.mapping.CourseMapping;
import nt.crm.NajotTalimCRM.mapping.LessonMapping;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LessonService{
    private final LessonRepository lessonRepository;
    private final CourseRepository courseRepository;

    public static ResponseDTO<LessonDTO> getLessonById(Integer id) {
        return null;
    }

    public ResponseDTO<LessonDTO> addLesson(Integer id){
       Lesson lesson =  lessonRepository.save(LessonMapping.toEntity(id));
        if(lesson != null){
            return new ResponseDTO<>(true, AppResponseCode.OK, AppResponseMessages.OK, LessonMapping.toDTO(lesson), null);
        }
        else return new ResponseDTO<>(false, AppResponseCode.NOT_FOUND, AppResponseMessages.NOT_FOUND, null, null);
    }
}

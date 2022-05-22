package nt.crm.NajotTalimCRM.SERVICE;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Course;
import nt.crm.NajotTalimCRM.DTO.CourseDTO;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.DTO.ValidatorDTO;
import nt.crm.NajotTalimCRM.REPOSITORY.CourseRepository;
import nt.crm.NajotTalimCRM.helper.Validator;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseCode;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseMessages;
import nt.crm.NajotTalimCRM.mapping.CourseMapping;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public ResponseDTO<CourseDTO> getCourse(Integer id){
       Optional<Course> course = courseRepository.findById(id);
       if(course.isPresent()){
           return new ResponseDTO<>(true, AppResponseCode.OK, AppResponseMessages.OK, CourseMapping.toDTO(course.get()), null);
       }
       return new ResponseDTO<>(false, AppResponseCode.NOT_FOUND, AppResponseMessages.NOT_FOUND, null, null);
    }

    public ResponseDTO<List<CourseDTO>> getAllCourses(){
        List<Course> courses = courseRepository.findAll();
        if(courses != null){
            return new ResponseDTO<>(true, AppResponseCode.OK, AppResponseMessages.OK, CourseMapping.courseDTOList(courses, 1), null);
        }
        return new ResponseDTO<>(false, AppResponseCode.NOT_FOUND, AppResponseMessages.NOT_FOUND, null, null);
    }

    public ResponseDTO<CourseDTO> addCourse(CourseDTO courseDTO) {
        List<ValidatorDTO> validators = Validator.validateCourse(courseDTO);
        return null;
    }
}

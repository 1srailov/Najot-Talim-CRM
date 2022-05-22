package nt.crm.NajotTalimCRM.helper;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.PupilAssessment;
import nt.crm.NajotTalimCRM.DTO.CourseDTO;
import nt.crm.NajotTalimCRM.DTO.PupilAssessmentDTO;
import nt.crm.NajotTalimCRM.DTO.TeacherDTO;
import nt.crm.NajotTalimCRM.DTO.ValidatorDTO;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseMessages;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class Validator {

        public static List<ValidatorDTO> validateTeacher(TeacherDTO teacherDTO){
            List<ValidatorDTO> errors = new ArrayList<>();
            if(teacherDTO.getFirstName() == null || teacherDTO.getFirstName().trim().length() < 1){
                errors.add(new ValidatorDTO("firstName", AppResponseMessages.EMPTY_FIELD));
            }

            if(teacherDTO.getLastName() == null || teacherDTO.getLastName().trim().length() < 1){
                errors.add(new ValidatorDTO("lastName", AppResponseMessages.EMPTY_FIELD));
            }

            if(!Checker.checkPhoneNumber(teacherDTO.getPhoneNumber())){
                errors.add(new ValidatorDTO("phoneNumber", AppResponseMessages.WRONG_TYPE));
            }
//            if(Checker.checkUserName(teacherDTO.getUserName())){
//                    errors.add(new ValidatorDTO("username", AppResponseMessages.EXIST_FIELD));
//            }

            if(teacherDTO.getPassword().length() < 8){
                errors.add(new ValidatorDTO("password", AppResponseMessages.SHORT_PASSWORD_LENGTH));
            }
            System.out.println(errors);
            return errors;
        }

    public static List<ValidatorDTO> validatePupilAssessment(PupilAssessmentDTO pupilAssessmentDTO){
            List<ValidatorDTO> validators = new ArrayList<>();
            if(pupilAssessmentDTO.getPupilId() == null || pupilAssessmentDTO.getPupilId() <= 0){
                validators.add(new ValidatorDTO("id", AppResponseMessages.MINUS_VALUE));
            }
            if(pupilAssessmentDTO.getAssessment() == null ||
                    pupilAssessmentDTO.getAssessment() > 100 || pupilAssessmentDTO.getAssessment() < 0){
                validators.add(new ValidatorDTO("Assessment", "bunday son kiritish mumkin emas"));
            }
            if (pupilAssessmentDTO.getRatingColor() == null || pupilAssessmentDTO.getRatingColor().trim().length() < 1){
                validators.add(new ValidatorDTO("rating", AppResponseMessages.EMPTY_FIELD));
            }
            return validators;
    }

    public static List<ValidatorDTO> validateCourse(CourseDTO courseDTO) {
            List<ValidatorDTO> validators = new ArrayList<>();
            if(courseDTO.getCourseName() == null || courseDTO.getCourseName().trim().length() == 0){
                validators.add(new ValidatorDTO("courseName", AppResponseMessages.EMPTY_FIELD));
            }
            if(courseDTO.getBranchDTO().getId() < 0 || courseDTO.getBranchDTO().getId() > 3){
                validators.add(new ValidatorDTO("Branch.id", AppResponseMessages.WRONG_TYPE));
            }
//            if (courseDTO.;)

        return validators;
    }
}


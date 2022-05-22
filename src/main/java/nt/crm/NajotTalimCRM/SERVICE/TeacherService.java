package nt.crm.NajotTalimCRM.SERVICE;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Teacher;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.DTO.TeacherDTO;
import nt.crm.NajotTalimCRM.DTO.ValidatorDTO;
import nt.crm.NajotTalimCRM.REPOSITORY.TeacherRepository;
import nt.crm.NajotTalimCRM.helper.Validator;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseCode;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseMessages;
import nt.crm.NajotTalimCRM.mapping.TeacherMapping;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService{
    private final TeacherRepository teacherRepository;

    public ResponseDTO<TeacherDTO> signUp(TeacherDTO teacherDTO){
        List<ValidatorDTO> validations = Validator.validateTeacher(teacherDTO);
        System.out.println(validations);
        if(validations.size() > 0){
            return new ResponseDTO<>(false, AppResponseCode.VALIDATION_ERROR, AppResponseMessages.VALIDATION_ERROR, null, validations);
        }
        else{
            teacherRepository.save(TeacherMapping.toDAO(teacherDTO));
            return new ResponseDTO<>(true, AppResponseCode.OK, AppResponseMessages.OK, teacherDTO, null);
        }
    }

    public ResponseDTO<TeacherDTO> login(TeacherDTO teacherDTO) {
        System.out.println(teacherDTO.toString());
        Teacher teacher = teacherRepository.findByUserNameAndPassWord(teacherDTO.getUserName(), teacherDTO.getPassword());
        if(teacher != null){
            return new ResponseDTO<>(true, AppResponseCode.OK, AppResponseMessages.OK, TeacherMapping.toDTO(teacher, 0), null);
        }else{
            return new ResponseDTO<>(false, AppResponseCode.NOT_FOUND, AppResponseMessages.NOT_FOUND, null, null);
        }
    }
}

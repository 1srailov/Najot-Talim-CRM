package nt.crm.NajotTalimCRM.SERVICE;


import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.PupilAssessment;
import nt.crm.NajotTalimCRM.DTO.PupilAssessmentDTO;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.DTO.ValidatorDTO;
import nt.crm.NajotTalimCRM.REPOSITORY.PupilAssessmentRepository;
import nt.crm.NajotTalimCRM.helper.Validator;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseCode;
import nt.crm.NajotTalimCRM.helper.constants.AppResponseMessages;
import nt.crm.NajotTalimCRM.mapping.PupilAssessmentMapping;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PupilAssessmentService{
    private final PupilAssessmentRepository pupilassessmentRepository;

    public ResponseDTO<PupilAssessmentDTO> addAssessment(PupilAssessmentDTO pupilAssessmentDTO){
        List<ValidatorDTO> validators = Validator.validatePupilAssessment(pupilAssessmentDTO);
        if(validators.size() > 0){
            return new ResponseDTO<>(false, AppResponseCode.VALIDATION_ERROR, AppResponseMessages.VALIDATION_ERROR, pupilAssessmentDTO, validators);
        }else{
            PupilAssessment pupilAssessment = pupilassessmentRepository.save(PupilAssessmentMapping.toEntity(pupilAssessmentDTO));
            return new ResponseDTO<>(true, AppResponseCode.OK, AppResponseMessages.OK, PupilAssessmentMapping.toDTO(pupilAssessment), null);
        }
    }
}

package nt.crm.NajotTalimCRM.REST;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.PupilAssessment;
import nt.crm.NajotTalimCRM.DTO.PupilAssessmentDTO;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.SERVICE.PupilAssessmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PupilAssessmentResource{
    private final PupilAssessmentService pupilAssessmentService;


    //login qilgandan keyin shu akkaunta bor guruhlarni ichidagi oquvchilarga ishlatoladi
    @PostMapping("add-assessment/{courseId}")
    public ResponseDTO<PupilAssessmentDTO> addAssessment(@RequestBody PupilAssessmentDTO pupilAssessmentDTO){
        return pupilAssessmentService.addAssessment(pupilAssessmentDTO);
    }
}

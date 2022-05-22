package nt.crm.NajotTalimCRM.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Pupil;
import nt.crm.NajotTalimCRM.DAO.Teacher;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseDTO {
    private Integer id;

    private String courseName;

    private TeacherDTO teacherDTO;

    private List<PupilDTO> pupilsDTOS;

    private BranchDTO branchDTO;

}

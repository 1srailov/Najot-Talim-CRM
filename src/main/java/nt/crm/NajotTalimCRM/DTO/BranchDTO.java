package nt.crm.NajotTalimCRM.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Course;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BranchDTO{
    private Integer id;

    private String branchName;

    private String branchAddress;

    private String adminPhoneNumber;

    private List<CourseDTO> coursesDTOS;
}

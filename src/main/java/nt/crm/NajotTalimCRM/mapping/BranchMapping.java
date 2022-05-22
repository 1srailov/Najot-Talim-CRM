package nt.crm.NajotTalimCRM.mapping;

import nt.crm.NajotTalimCRM.DAO.Branch;
import nt.crm.NajotTalimCRM.DTO.BranchDTO;

public class BranchMapping {
    public static BranchDTO toDTO(Branch branch){
        if(branch == null){
            return null;
        }
        return new BranchDTO(branch.getId(), branch.getBranchName(),
                branch.getBranchAddress(), branch.getAdminPhoneNumber(),
                CourseMapping.courseDTOList(branch.getCourses()));
    }
    public static Branch toEntity(BranchDTO branchDTO){
        if(branchDTO == null){
            return null;
        }
        return new Branch(branchDTO.getId(), branchDTO.getBranchName(),
                branchDTO.getBranchAddress(), branchDTO.getAdminPhoneNumber(), CourseMapping.courseEntityList(branchDTO.getCoursesDTOS()));
    }
}

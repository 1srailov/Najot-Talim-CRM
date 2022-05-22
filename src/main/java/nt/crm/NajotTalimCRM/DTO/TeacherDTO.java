package nt.crm.NajotTalimCRM.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Course;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {
    private Integer id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String userName;

    private String password;

    private List<CourseDTO> courseDTOS;


}

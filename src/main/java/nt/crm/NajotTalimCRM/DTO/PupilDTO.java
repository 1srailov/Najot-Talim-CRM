package nt.crm.NajotTalimCRM.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PupilDTO {
    private Integer id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private CourseDTO courseDTO;
}

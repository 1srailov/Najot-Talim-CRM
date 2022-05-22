package nt.crm.NajotTalimCRM.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidatorDTO {
    private String fieldName;
    private String Error;
}

package nt.crm.NajotTalimCRM.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO<T> {
    private boolean success;
    private Integer code;
    private String message;
    private T data;
    private List<ValidatorDTO> validatorDtoList;
}

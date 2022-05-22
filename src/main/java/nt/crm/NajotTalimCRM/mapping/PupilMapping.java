package nt.crm.NajotTalimCRM.mapping;

import nt.crm.NajotTalimCRM.DAO.Pupil;
import nt.crm.NajotTalimCRM.DTO.PupilDTO;

import java.util.ArrayList;
import java.util.List;

public class PupilMapping {

    public static List<PupilDTO> toDTOS(List<Pupil> pupils){
        if(pupils == null){
            return null;
        }
        List<PupilDTO> pupilDTOS = new ArrayList<>();
        for(Pupil p : pupils){
            pupilDTOS.add(toDTO(p));
        }
        return pupilDTOS;
    }

    public static PupilDTO toDTO(Pupil pupil){
        return pupil == null ? null :
        new PupilDTO(pupil.getId(), pupil.getFirstName(),
                pupil.getLastName(), pupil.getPhoneNumber(), null);
    }

    public static Pupil toEntity(PupilDTO pupilDTO){
        return pupilDTO == null ? null :
                new Pupil(pupilDTO.getId(), pupilDTO.getFirstName(), pupilDTO.getLastName(),
                        pupilDTO.getPhoneNumber(), null);
    }
}

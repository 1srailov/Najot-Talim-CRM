package nt.crm.NajotTalimCRM.helper;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.REPOSITORY.TeacherRepository;
import nt.crm.NajotTalimCRM.SERVICE.TeacherService;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.beans.factory.annotation.Autowired;


@RequiredArgsConstructor
public class Checker {

    public static boolean checkPhoneNumber(String number){
        if(number.length() != 13 ||! number.substring(0, 4).equals("+998")){
            System.out.println("1shart" + number.substring(0, 4) + " " + number.length());
            return false;
        }
            try{
                Integer num = Integer.parseInt(number.substring(4, number.length()));
                System.out.println(number);
                return true;
            }catch (Exception e){
                System.out.println(number + "FALSE");
                return false;
            }
    }

}

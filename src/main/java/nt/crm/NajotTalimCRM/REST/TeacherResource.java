package nt.crm.NajotTalimCRM.REST;


import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.DTO.TeacherDTO;
import nt.crm.NajotTalimCRM.SERVICE.TeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeacherResource {
    private final TeacherService teacherService;
    //faqat admin ishlata oladi
    @PostMapping("/admin/add-teacher")
    public ResponseDTO<TeacherDTO> signUp(@RequestBody TeacherDTO teacherDTO){
      return teacherService.signUp(teacherDTO);
    }
    /*ustozlar-assistentlar kirishi uchun
    kirganidan keyin
    1)start-lesson
    */
    @PostMapping("/login")
    public ResponseDTO<TeacherDTO> login(@RequestBody TeacherDTO teacherDTO){
        return teacherService.login(teacherDTO);
    }

}

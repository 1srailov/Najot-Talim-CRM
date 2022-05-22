package nt.crm.NajotTalimCRM.REST;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Lesson;
import nt.crm.NajotTalimCRM.DTO.CourseDTO;
import nt.crm.NajotTalimCRM.DTO.LessonDTO;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.SERVICE.LessonService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LessonResource{
   private final LessonService lessonService;

/*
darsni boshlaganidan keyin oquvchilarni royxatichiqadi
foydalanuvchi har bitta oquvchiga baho qoyoladi
= /add-assessment/{courseId}

 */
@GetMapping("/{id}/start-lesson")
    public ResponseDTO<LessonDTO> startLesson(@PathVariable Integer id){
        return lessonService.addLesson(id);
}

@GetMapping("/get-lesson-history/{id}")
    public ResponseDTO<LessonDTO> getLesson(@PathVariable Integer id){
    return LessonService.getLessonById(id);
}

}

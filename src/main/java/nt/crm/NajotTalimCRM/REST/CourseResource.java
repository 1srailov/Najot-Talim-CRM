package nt.crm.NajotTalimCRM.REST;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DTO.CourseDTO;
import nt.crm.NajotTalimCRM.DTO.ResponseDTO;
import nt.crm.NajotTalimCRM.DTO.TeacherDTO;
import nt.crm.NajotTalimCRM.SERVICE.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseResource {
    private final CourseService courseService;

    @GetMapping("/get-course-by-id/{id}")
    public ResponseDTO<CourseDTO> signUp(@PathVariable Integer id){
        return courseService.getCourse(id);
    }

    @GetMapping("/get-all-courses")
    public ResponseDTO<List<CourseDTO>> getAll(){
        return courseService.getAllCourses();
    }

    @PutMapping("/add-course")
    public ResponseDTO<CourseDTO> addCourse(@RequestBody CourseDTO courseDTO){
        return courseService.addCourse(courseDTO);
    }
}

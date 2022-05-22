package nt.crm.NajotTalimCRM.mapping;

import nt.crm.NajotTalimCRM.DAO.Course;
import nt.crm.NajotTalimCRM.DTO.CourseDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseMapping {

    public static List<CourseDTO> courseDTOList(List<Course> courses, Integer code){
        if(courses == null){
            return null;
        }
            List<CourseDTO> dtos = new ArrayList<>();
        if(code == 0) {
            courses.stream().map(a -> {
                a.setPupils(null);
                a.getBranch().setCourses(null);
                dtos.add(new CourseDTO(a.getId(), a.getCourseName(), null, PupilMapping.toDTOS(a.getPupils()), BranchMapping.toDTO(a.getBranch())));
                return a;
            }).collect(Collectors.toList());
        }
        else if(code == 1){
            courses.stream().map(a -> {
                a.setPupils(null);
                a.getBranch().setCourses(null);
                a.getTeacher().setCourses(null);
                dtos.add(new CourseDTO(a.getId(), a.getCourseName(), TeacherMapping.toDTO(a.getTeacher(), 1), PupilMapping.toDTOS(a.getPupils()), BranchMapping.toDTO(a.getBranch())));
                return a;
            }).collect(Collectors.toList());
        }
            return dtos;
    }

    public static CourseDTO toDTO(Course course){
        if(course != null) {
            course.setTeacher(null);
            if(course.getPupils() != null){
            course.setPupils(course.getPupils().stream().map(a -> {
                a.setCourse(null);
                return a;
            }).collect(Collectors.toList()));
            }
            course.getBranch().setCourses(null);
            return new CourseDTO(course.getId(), course.getCourseName(), null,
                    PupilMapping.toDTOS(course.getPupils()), BranchMapping.toDTO(course.getBranch()));
        }
        return null;
    }

    public static List<Course> courseEntityList(List<CourseDTO> coursesDTOS) {
        List<Course> courses = new ArrayList<>();
        courses.stream().map(a -> {
            courses.add(new Course(a.getId(), a.getCourseName(), a.getStartAt(), null, null, null));
            return a;
        }).collect(Collectors.toList());
        return courses;
    }

    public static List<CourseDTO> courseDTOList(List<Course> courses) {
        if(courses == null){
            return null;
        }
        List<CourseDTO> courseDTOS = new ArrayList<>();
        for(Course c : courses){
            courseDTOS.add(toDTO(c));
        }
        return courseDTOS;
    }
}

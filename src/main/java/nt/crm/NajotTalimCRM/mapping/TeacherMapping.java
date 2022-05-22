package nt.crm.NajotTalimCRM.mapping;

import nt.crm.NajotTalimCRM.DAO.Course;
import nt.crm.NajotTalimCRM.DAO.Teacher;
import nt.crm.NajotTalimCRM.DTO.TeacherDTO;


public class TeacherMapping {
    public static Teacher toDAO(TeacherDTO teacherDTO){
        return new Teacher(null, teacherDTO.getFirstName(),
                teacherDTO.getLastName(), teacherDTO.getPhoneNumber(),
                teacherDTO.getUserName(), null, null);
    }

    public static TeacherDTO toDTO(Teacher teacher, Integer code){
        if(code == 1){
            teacher.setPassWord(null);
        }
        if(teacher.getCourses() != null) {
            for (Course c : teacher.getCourses()) {
                c.setPupils(null);
            }
        }
        return new TeacherDTO(teacher.getId(), teacher.getFirstName(),
                teacher.getLastName(), teacher.getPhoneNumber(), teacher.getUserName(),
                teacher.getPassWord(), CourseMapping.courseDTOList(teacher.getCourses()));
    }
}

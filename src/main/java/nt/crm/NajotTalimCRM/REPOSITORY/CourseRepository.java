package nt.crm.NajotTalimCRM.REPOSITORY;

import nt.crm.NajotTalimCRM.DAO.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}

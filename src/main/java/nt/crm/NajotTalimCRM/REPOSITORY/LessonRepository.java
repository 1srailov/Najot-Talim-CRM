package nt.crm.NajotTalimCRM.REPOSITORY;

import nt.crm.NajotTalimCRM.DAO.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
}
package nt.crm.NajotTalimCRM.REPOSITORY;

import lombok.RequiredArgsConstructor;
import nt.crm.NajotTalimCRM.DAO.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Boolean existsByUserName(String username);
    Teacher findByUserNameAndPassWord(String username,String password);
}
package nt.crm.NajotTalimCRM.REPOSITORY;

import nt.crm.NajotTalimCRM.DAO.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepository extends JpaRepository<Pupil, Integer> {

}

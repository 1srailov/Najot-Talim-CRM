package nt.crm.NajotTalimCRM.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "branchs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(generator = "branchs_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "admin_phone_number")
    private String adminPhoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "branch")
    private List<Course> courses;
}

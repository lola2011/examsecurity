package kg.securityexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="full_name",nullable = false)
    private String fullName;
    @Column(name="registration_date", nullable = false)
    private Timestamp registration;
    @Column(name="contract_sum",nullable=false)
    private Integer contractSum;
}

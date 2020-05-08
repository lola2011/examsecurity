package kg.securityexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private String name;
    private String cite;
    private String paymentTerm;
}

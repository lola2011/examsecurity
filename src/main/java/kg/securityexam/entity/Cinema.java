package kg.securityexam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    private String name;
    private Integer capacity;
    private String address;
    private String site;
}

/**
 * Represents a teacher entity in the system.
 * This entity is mapped to the "teachers" table in the database.
 * It includes information such as unique ID, VAT number, name, and region.
 * @author Marios Morfo
 * @version 0.1
 */



package gr.aueb.cf.teacherapp.model;

import gr.aueb.cf.teacherapp.model.static_data.Region;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String uuid;

    @Column(unique = true)
    private String  vat;

    private String firstname;
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @PrePersist
    public void initializeUUID(){
        if(uuid == null) uuid = UUID.randomUUID().toString();
    }
}

package techlearn.springboot.restapi.persistance.domain;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private String description;

    @Column(name="created_on", nullable = false)
    private Date createdOn;

    @Column(name="updated_on")
    private Date updatedOn;

}

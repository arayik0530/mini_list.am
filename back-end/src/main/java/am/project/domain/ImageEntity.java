package am.project.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "image")
public class ImageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "picture")
    @Lob
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private byte[] picture;

}

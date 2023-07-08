package hot.spring.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Detail {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long detailId;
    
    private String detail;
    
    //relationships
    @EqualsAndHashCode.Exclude
    @ToString.Exclude  
    @ManyToMany(mappedBy = "details")
    private Set<HotSpring> hotSprings = new HashSet<>();
}



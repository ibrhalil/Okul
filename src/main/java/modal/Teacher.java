package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "TEACHERS")
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends User {

    @Column(name = "DUTY")
    private String job;

    //private Set<Class> classes;
}

package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @Column(name = "ID")
    private UUID uuid;

    @OneToMany
    private Map<ContactType, Address> addresses;

    @OneToMany
    private Set<String> phones;

    @OneToMany
    private Set<String> eMails;
}

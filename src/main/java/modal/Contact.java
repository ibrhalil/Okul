package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private Map<ContactType, Address> addresses;
    private Set<String> phones;
    private Set<String> eMails;
}

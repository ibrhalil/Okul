package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    Map<ContactType, Address> addresses;
    Map<ContactType, String> phones;
    Set<String> eMails;
}

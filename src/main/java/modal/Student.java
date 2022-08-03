package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Student extends User {
    String number;
    Set<Class> classes;
    List<Duty> homework;
    Map<Absence, List<Date>> absencePeriod;
}

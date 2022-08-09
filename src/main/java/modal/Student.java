package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Student extends User {
    private String number = "";
    private Set<Class> classes = new HashSet<>();
    private List<Duty> homework = new ArrayList<>();
    private Map<Absence, List<Date>> absencePeriod = new HashMap<>();

    @Override
    public String getPersonInfo() {
        String info = super.getPersonInfo();
        info = info.concat("number : ").concat(this.getNumber()).concat(", \n");
        info = info.concat("classes : ").concat(this.getClasses().toString()).concat(", \n");
        info = info.concat("homework : ").concat(this.getHomework().toString()).concat(", \n");
        info = info.concat("absencePeriod : ").concat(this.getAbsencePeriod().toString()).concat(", \n");

        return info;
    }
}

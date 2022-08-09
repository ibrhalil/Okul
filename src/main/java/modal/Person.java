package modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {
    private String name;
    private String lastName;
    private Gender gender;
    private Contact contact;

    public String getPersonInfo() {

        String info = "Person {\n" ;
        info = info.concat("name : ").concat(this.getName()).concat(", \n");
        info = info.concat("lastName : ").concat(this.getLastName()).concat(", \n");
        info = info.concat("gender : ").concat(this.getGender().toString()).concat(", \n");
        info = info.concat("contact : ").concat(this.getContact().toString()).concat(", \n");

        return info;
    }
}

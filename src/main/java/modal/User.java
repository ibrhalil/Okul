package modal;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class User extends Person {

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "IS_ACTIVE")
    private boolean active;

    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date createDate = new Date();
}

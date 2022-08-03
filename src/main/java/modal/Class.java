package modal;

import lombok.*;

@Data
@RequiredArgsConstructor
@ToString
public class Class {
    @NonNull
    String name;

    Teacher overseerTeacher;
}

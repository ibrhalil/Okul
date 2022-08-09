package modal;

import lombok.*;

@Data
@RequiredArgsConstructor
public class Class {
    @NonNull
    private String name;

    private Teacher overseerTeacher;
}

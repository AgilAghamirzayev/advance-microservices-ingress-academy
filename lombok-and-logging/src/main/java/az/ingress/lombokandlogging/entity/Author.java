package az.ingress.lombokandlogging.entity;

import lombok.*;

//@Data
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private int id;
    private String name;
    @Setter(AccessLevel.PROTECTED)
    private String surname;
}

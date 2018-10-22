package spittr;

import javax.validation.constraints.*;
import org.apache.commons.lang3.builder.*;

public class Spitter {
    private Long id;

    @NotNull
    @Size(min=5,max=16)
    private String username;

    @NotNull
    @Size(min=5,max=25)
    private String password;

    @NotNull
    @Size(min=2,max=30)
    private String firstName;

    @NotNull
    @Size(min=2,max=30)
    private String lastName;
}

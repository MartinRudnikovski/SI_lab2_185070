import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 siLab2 = new SILab2();
    @Test
    void function() {
        assertThrows(IllegalArgumentException.class, ()->siLab2.function(new ArrayList<>()));
    }
}
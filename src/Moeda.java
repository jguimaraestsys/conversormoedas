import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record Moeda(String base_code, List<Moeda> conversion_rates) {
}

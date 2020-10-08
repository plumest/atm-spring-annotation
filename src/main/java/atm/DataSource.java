package atm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Primary
public interface DataSource {
    Map<Integer,Customer> readCustomers();
}

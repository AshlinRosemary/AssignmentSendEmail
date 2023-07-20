package Email;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("postgresqldatasource")
@Primary
public class PostgreSQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {
        String[] emails={"Miriam@gmail.com, nannu@gmail.com, kafka@gmail.com"};
        return emails;
    }
}

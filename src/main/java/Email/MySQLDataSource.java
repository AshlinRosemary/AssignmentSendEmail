package Email;

import org.springframework.stereotype.Component;

@Component("mysqldatasource")
public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails={"ashlin@gmail.com, rose@gmail.com, mary@gmail.com"};
        return emails;
    }
}

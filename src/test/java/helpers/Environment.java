package helpers;

import static java.lang.Boolean.parseBoolean;

public class Environment {

    public final static String
            bsLogin = System.getProperty("bs_login", ""),
            bsPassword = System.getProperty("bs_password", ""),
            buildNumber = System.getProperty("build_number", "0"),
            jobBaseName = System.getProperty("job_base_name", "local");
}

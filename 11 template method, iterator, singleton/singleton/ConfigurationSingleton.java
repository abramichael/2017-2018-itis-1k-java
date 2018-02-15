package itis.singleton;

public class ConfigurationSingleton {
    private static Configuration conf;
    public static Configuration getConfig() {
        if (conf == null) {
            conf = new Configuration();
        }
        return conf;
    }
}

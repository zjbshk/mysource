import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "yuanqinnan.hello")
public class HelloProperties {
    //前缀
    private String prefix;
    //后缀
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
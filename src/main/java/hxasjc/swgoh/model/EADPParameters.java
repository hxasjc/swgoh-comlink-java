package hxasjc.swgoh.model;

@SuppressWarnings("unused")
public class EADPParameters {
    private String eadpBaseUrl;
    private String eaMobileClientId;
    private String eadpBaseUrlClient;
    private String eadpAllowedCryptKey;
    private String eadpClientId;
    private String eadpWindowsEncryptSeed;
    private String eadoWindowsContentId;
    private String eadpWindowsMultiplayerId;
    private String eadpWindowsTitle;
    private String eadpWindowsCommerceGroupName;
    private String eadpClientSecret;
    private String eadpEnv;
    private String eadpWindowsAchievementCode;

    public String getEadpBaseUrl() {
        return eadpBaseUrl;
    }

    public String getEaMobileClientId() {
        return eaMobileClientId;
    }

    public String getEadpBaseUrlClient() {
        return eadpBaseUrlClient;
    }

    public String getEadpAllowedCryptKey() {
        return eadpAllowedCryptKey;
    }

    public String getEadpClientId() {
        return eadpClientId;
    }

    public String getEadpWindowsEncryptSeed() {
        return eadpWindowsEncryptSeed;
    }

    public String getEadoWindowsContentId() {
        return eadoWindowsContentId;
    }

    public String getEadpWindowsMultiplayerId() {
        return eadpWindowsMultiplayerId;
    }

    public String getEadpWindowsTitle() {
        return eadpWindowsTitle;
    }

    public String getEadpWindowsCommerceGroupName() {
        return eadpWindowsCommerceGroupName;
    }

    public String getEadpClientSecret() {
        return eadpClientSecret;
    }

    public String getEadpEnv() {
        return eadpEnv;
    }

    public String getEadpWindowsAchievementCode() {
        return eadpWindowsAchievementCode;
    }

    @Override
    public String toString() {
        return "EADPParameters{" +
                "eadpBaseUrl='" + eadpBaseUrl + '\'' +
                ", eaMobileClientId='" + eaMobileClientId + '\'' +
                ", eadpBaseUrlClient='" + eadpBaseUrlClient + '\'' +
                ", eadpAllowedCryptKey='" + eadpAllowedCryptKey + '\'' +
                ", eadpClientId='" + eadpClientId + '\'' +
                ", eadpWindowsEncryptSeed='" + eadpWindowsEncryptSeed + '\'' +
                ", eadoWindowsContentId='" + eadoWindowsContentId + '\'' +
                ", eadpWindowsMultiplayerId='" + eadpWindowsMultiplayerId + '\'' +
                ", eadpWindowsTitle='" + eadpWindowsTitle + '\'' +
                ", eadpWindowsCommerceGroupName='" + eadpWindowsCommerceGroupName + '\'' +
                ", eadpClientSecret='" + eadpClientSecret + '\'' +
                ", eadpEnv='" + eadpEnv + '\'' +
                ", eadpWindowsAchievementCode='" + eadpWindowsAchievementCode + '\'' +
                '}';
    }
}

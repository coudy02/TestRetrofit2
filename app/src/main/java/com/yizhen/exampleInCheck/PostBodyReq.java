package com.yizhen.exampleInCheck;

class PostBodyReq {


    /**
     * appId :
     * method :
     * tokenId :
     * data : {"versionType":"0"}
     */

    private String appId;
    private String method;
    private String tokenId;
    private ReqVersionInfo data;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public ReqVersionInfo getData() {
        return data;
    }

    public void setData(ReqVersionInfo data) {
        this.data = data;
    }

    public static class ReqVersionInfo {
        /**
         * versionType : 0
         */

        private String versionType;

        public String getVersionType() {
            return versionType;
        }

        public void setVersionType(String versionType) {
            this.versionType = versionType;
        }
    }
}

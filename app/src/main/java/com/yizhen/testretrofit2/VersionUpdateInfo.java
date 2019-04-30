package com.yizhen.testretrofit2;

public class VersionUpdateInfo {


    /**
     * data : {"versionUpdateInfo":{"versionId":32,"versionName":"4.0.4","versionCode":"44","versionType":"1","versionTypeName":"","downloadUrl":"http://183.56.131.6:8004/images/dp-cms/check_44_common_20190108.apk ","innerDownloadUrl":"","status":"S0A","createDate":1528229768000,"createUser":1,"modifyDate":1547017552000,"modifyUser":35956,"remark":"","updateType":"2"}}
     * resultCode : 0
     * resultMsg : 操作成功
     */

    private DataBean data;
    private String resultCode;
    private String resultMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public static class DataBean {
        /**
         * versionUpdateInfo : {"versionId":32,"versionName":"4.0.4","versionCode":"44","versionType":"1","versionTypeName":"","downloadUrl":"http://183.56.131.6:8004/images/dp-cms/check_44_common_20190108.apk ","innerDownloadUrl":"","status":"S0A","createDate":1528229768000,"createUser":1,"modifyDate":1547017552000,"modifyUser":35956,"remark":"","updateType":"2"}
         */

        private VersionUpdateInfoBean versionUpdateInfo;

        public VersionUpdateInfoBean getVersionUpdateInfo() {
            return versionUpdateInfo;
        }

        public void setVersionUpdateInfo(VersionUpdateInfoBean versionUpdateInfo) {
            this.versionUpdateInfo = versionUpdateInfo;
        }

        public static class VersionUpdateInfoBean {
            /**
             * versionId : 32
             * versionName : 4.0.4
             * versionCode : 44
             * versionType : 1
             * versionTypeName :
             * downloadUrl : http://183.56.131.6:8004/images/dp-cms/check_44_common_20190108.apk
             * innerDownloadUrl :
             * status : S0A
             * createDate : 1528229768000
             * createUser : 1
             * modifyDate : 1547017552000
             * modifyUser : 35956
             * remark :
             * updateType : 2
             */

            private int versionId;
            private String versionName;
            private String versionCode;
            private String versionType;
            private String versionTypeName;
            private String downloadUrl;
            private String innerDownloadUrl;
            private String status;
            private long createDate;
            private int createUser;
            private long modifyDate;
            private int modifyUser;
            private String remark;
            private String updateType;

            public int getVersionId() {
                return versionId;
            }

            public void setVersionId(int versionId) {
                this.versionId = versionId;
            }

            public String getVersionName() {
                return versionName;
            }

            public void setVersionName(String versionName) {
                this.versionName = versionName;
            }

            public String getVersionCode() {
                return versionCode;
            }

            public void setVersionCode(String versionCode) {
                this.versionCode = versionCode;
            }

            public String getVersionType() {
                return versionType;
            }

            public void setVersionType(String versionType) {
                this.versionType = versionType;
            }

            public String getVersionTypeName() {
                return versionTypeName;
            }

            public void setVersionTypeName(String versionTypeName) {
                this.versionTypeName = versionTypeName;
            }

            public String getDownloadUrl() {
                return downloadUrl;
            }

            public void setDownloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
            }

            public String getInnerDownloadUrl() {
                return innerDownloadUrl;
            }

            public void setInnerDownloadUrl(String innerDownloadUrl) {
                this.innerDownloadUrl = innerDownloadUrl;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public int getCreateUser() {
                return createUser;
            }

            public void setCreateUser(int createUser) {
                this.createUser = createUser;
            }

            public long getModifyDate() {
                return modifyDate;
            }

            public void setModifyDate(long modifyDate) {
                this.modifyDate = modifyDate;
            }

            public int getModifyUser() {
                return modifyUser;
            }

            public void setModifyUser(int modifyUser) {
                this.modifyUser = modifyUser;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getUpdateType() {
                return updateType;
            }

            public void setUpdateType(String updateType) {
                this.updateType = updateType;
            }
        }
    }
}

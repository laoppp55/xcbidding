package com.bizwink.vo;

import java.io.Serializable;

public class voBulletinNotice implements Serializable{
    private String uuid;
    private String bulletintitle;
    private String createtime;
    private int readflag;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getBulletintitle() {
        return bulletintitle;
    }

    public void setBulletintitle(String bulletintitle) {
        this.bulletintitle = bulletintitle;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getReadflag() {
        return readflag;
    }

    public void setReadflag(int readflag) {
        this.readflag = readflag;
    }
}

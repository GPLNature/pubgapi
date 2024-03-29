package com.github.gplnature.pubgapi.model.player;

import java.time.ZonedDateTime;

public class PlayerAttributes {

    @Deprecated
    private ZonedDateTime createdAt;

    private String name;

    private String patchVersion;

    private String shardId;

    private String banType;

    private String titleId;

    public PlayerAttributes() {
    }

    @Deprecated
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatchVersion() {
        return patchVersion;
    }

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getBanType() {
        return banType;
    }

    public void setBanType(String banType) {
        this.banType = banType;
    }
}

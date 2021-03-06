package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

public class LogPlayerTakeDamage extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("victim")
    private Character victim;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageReason")
    private DamageReason damageReason;

    // 1.0 damage = 1.0 health
    // Net damage after armor; damage to health
    @SerializedName("damage")
    private Float damage;

    @SerializedName("damageCauserName")
    private String damageCauserName;

    @SerializedName("isThroughPenetrableWall")
    private Boolean isThroughPenetrableWall;

    public LogPlayerTakeDamage() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public DamageReason getDamageReason() {
        return damageReason;
    }

    public void setDamageReason(DamageReason damageReason) {
        this.damageReason = damageReason;
    }

    public Float getDamage() {
        return damage;
    }

    public void setDamage(Float damage) {
        this.damage = damage;
    }

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Boolean getThroughPenetrableWall() {
        return isThroughPenetrableWall;
    }

    public void setThroughPenetrableWall(Boolean throughPenetrableWall) {
        isThroughPenetrableWall = throughPenetrableWall;
    }
}

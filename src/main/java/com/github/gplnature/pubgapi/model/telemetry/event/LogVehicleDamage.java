package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Vehicle;
import com.google.gson.annotations.SerializedName;

public class LogVehicleDamage extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("vehicle")
    private Vehicle vehicle;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauseName")
    private String damageCauseName;

    @SerializedName("damage")
    private Float damage;

    @SerializedName("distance")
    private Float distance;

    public LogVehicleDamage() {
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public String getDamageCauseName() {
        return damageCauseName;
    }

    public void setDamageCauseName(String damageCauseName) {
        this.damageCauseName = damageCauseName;
    }

    public Float getDamage() {
        return damage;
    }

    public void setDamage(Float damage) {
        this.damage = damage;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}

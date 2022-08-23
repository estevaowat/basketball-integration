package com.ewcode.team.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;

public class Team extends PanacheEntity {
  @Column private String leagueId;
  @Column private String minYear;
  @Column private String maxYear;
  @Column private String abbreviation;
  @Column private String nickname;
  @Column private String yearFounded;
  @Column private String city;
  @Column private String arena;
  @Column private String arenaCapacity;
  @Column private String owner;
  @Column private String generalManager;
  @Column private String headcoach;
  @Column private String dleagueaffiliation;

  public String getLeagueId() {
    return leagueId;
  }

  public Team setLeagueId(String leagueId) {
    this.leagueId = leagueId;
    return this;
  }

  public String getMinYear() {
    return minYear;
  }

  public Team setMinYear(String minYear) {
    this.minYear = minYear;
    return this;
  }

  public String getMaxYear() {
    return maxYear;
  }

  public Team setMaxYear(String maxYear) {
    this.maxYear = maxYear;
    return this;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public Team setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  public String getNickname() {
    return nickname;
  }

  public Team setNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public String getYearFounded() {
    return yearFounded;
  }

  public Team setYearFounded(String yearFounded) {
    this.yearFounded = yearFounded;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Team setCity(String city) {
    this.city = city;
    return this;
  }

  public String getArena() {
    return arena;
  }

  public Team setArena(String arena) {
    this.arena = arena;
    return this;
  }

  public String getArenaCapacity() {
    return arenaCapacity;
  }

  public Team setArenaCapacity(String arenaCapacity) {
    this.arenaCapacity = arenaCapacity;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public Team setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getGeneralManager() {
    return generalManager;
  }

  public Team setGeneralManager(String generalManager) {
    this.generalManager = generalManager;
    return this;
  }

  public String getHeadcoach() {
    return headcoach;
  }

  public Team setHeadcoach(String headcoach) {
    this.headcoach = headcoach;
    return this;
  }

  public String getDleagueaffiliation() {
    return dleagueaffiliation;
  }

  public Team setDleagueaffiliation(String dleagueaffiliation) {
    this.dleagueaffiliation = dleagueaffiliation;
    return this;
  }
}

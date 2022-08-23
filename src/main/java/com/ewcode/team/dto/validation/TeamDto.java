package com.ewcode.team.dto.validation;

public class TeamDto {

  private String leagueId;
  private String id;
  private String min_year;
  private String max_year;
  private String abbreviation;
  private String nickname;
  private String year_founded;
  private String city;
  private String arena;
  private String arena_capacity;
  private String owner;
  private String generalmanager;
  private String headcoach;
  private String dleagueaffiliation;

  public String getLeagueId() {
    return leagueId;
  }

  public TeamDto setLeagueId(String leagueId) {
    this.leagueId = leagueId;
    return this;
  }

  public String getId() {
    return id;
  }

  public TeamDto setId(String id) {
    this.id = id;
    return this;
  }

  public String getMin_year() {
    return min_year;
  }

  public TeamDto setMin_year(String min_year) {
    this.min_year = min_year;
    return this;
  }

  public String getMax_year() {
    return max_year;
  }

  public TeamDto setMax_year(String max_year) {
    this.max_year = max_year;
    return this;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public TeamDto setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  public String getNickname() {
    return nickname;
  }

  public TeamDto setNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public String getYearfounded() {
    return year_founded;
  }

  public TeamDto setYearfounded(String yearfounded) {
    year_founded = yearfounded;
    return this;
  }

  public String getCity() {
    return city;
  }

  public TeamDto setCity(String city) {
    this.city = city;
    return this;
  }

  public String getArena() {
    return arena;
  }

  public TeamDto setArena(String arena) {
    this.arena = arena;
    return this;
  }

  public String getArena_capacity() {
    return arena_capacity;
  }

  public TeamDto setArena_capacity(String arena_capacity) {
    this.arena_capacity = arena_capacity;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public TeamDto setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getGeneralmanager() {
    return generalmanager;
  }

  public TeamDto setGeneralmanager(String generalmanager) {
    this.generalmanager = generalmanager;
    return this;
  }

  public String getHeadcoach() {
    return headcoach;
  }

  public TeamDto setHeadcoach(String headcoach) {
    this.headcoach = headcoach;
    return this;
  }

  public String getDleagueaffiliation() {
    return dleagueaffiliation;
  }

  public TeamDto setDleagueaffiliation(String dleagueaffiliation) {
    this.dleagueaffiliation = dleagueaffiliation;
    return this;
  }
}

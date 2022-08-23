package com.ewcode.team.services;

import com.ewcode.team.dto.validation.CsvTeamEnum;
import com.ewcode.team.dto.validation.TeamDto;
import com.ewcode.team.dto.validation.TeamValidator;
import com.ewcode.team.entities.Team;
import com.ewcode.team.repository.TeamRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.modelmapper.ModelMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class TeamService {
  private final Logger logger = Logger.getLogger(TeamService.class.getName());
  private final ModelMapper modelMapper = new ModelMapper();

  @Inject TeamRepository teamRepository;
  @Inject TeamValidator teamValidator;

  public List<Team> save() throws IOException, URISyntaxException {
    CSVFormat csvFormatter =
        CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).build();

    File file = getFileFromSource();
    FileReader fileReader = new FileReader(file);
    Iterable<CSVRecord> records = csvFormatter.parse(fileReader);

    List<Team> teams = new ArrayList<>();

    for (CSVRecord teamRecord : records) {
      TeamDto teamDto = createTeamDto(teamRecord);
      List<String> errors = teamValidator.validate(teamDto);

      if (!errors.isEmpty()) {
        logger.info("Erro na validação do time");

        for (String error : errors) {
          logger.info(error);
        }

      } else {

        Team team = modelMapper.map(teamDto, Team.class);
        teams.add(team);
      }
    }

    teamRepository.persist(teams);

    return teams;
  }

  private File getFileFromSource() throws URISyntaxException {
    URL resource = getClass().getClassLoader().getResource("csvs/teams.csv");
    File file = new File(resource.toURI());
    return file;
  }

  private TeamDto createTeamDto(CSVRecord teamRecord) {
    String id = teamRecord.get(CsvTeamEnum.ID.name());
    String leagueId = teamRecord.get(CsvTeamEnum.LEAGUE_ID.name());
    String minYear = teamRecord.get(CsvTeamEnum.MIN_YEAR.name());
    String maxYear = teamRecord.get(CsvTeamEnum.MAX_YEAR.name());
    String abbreviation = teamRecord.get(CsvTeamEnum.ABBREVIATION.name());
    String nickname = teamRecord.get(CsvTeamEnum.NICKNAME.name());
    String yearfounded = teamRecord.get(CsvTeamEnum.YEARFOUNDED.name());
    String city = teamRecord.get(CsvTeamEnum.CITY.name());
    String arena = teamRecord.get(CsvTeamEnum.ARENA.name());
    String arenacapacity = teamRecord.get(CsvTeamEnum.ARENACAPACITY.name());
    String owner = teamRecord.get(CsvTeamEnum.OWNER.name());
    String generalmanager = teamRecord.get(CsvTeamEnum.GENERALMANAGER.name());
    String headcoach = teamRecord.get(CsvTeamEnum.HEADCOACH.name());
    String dleagueaffiliation = teamRecord.get(CsvTeamEnum.DLEAGUEAFFILIATION.name());

    return new TeamDto()
        .setId(id)
        .setLeagueId(leagueId)
        .setMin_year(minYear)
        .setMax_year(maxYear)
        .setAbbreviation(abbreviation)
        .setNickname(nickname)
        .setYearfounded(yearfounded)
        .setCity(city)
        .setArena(arena)
        .setArena_capacity(arenacapacity)
        .setOwner(owner)
        .setGeneralmanager(generalmanager)
        .setHeadcoach(headcoach)
        .setDleagueaffiliation(dleagueaffiliation);
  }
}

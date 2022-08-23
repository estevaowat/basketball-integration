package com.ewcode.team.services;

import com.ewcode.team.dto.validation.TeamValidator;
import com.ewcode.team.entities.Team;
import com.ewcode.team.repository.TeamRepository;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@QuarkusTest
public class TeamServiceTest {
  @Inject TeamService teamService;
  @InjectMock TeamRepository teamRepository;
  @InjectMock TeamValidator teamValidator;

  @Test
  @DisplayName("should import teams to database from csv")
  void shouldImportTeamsToDatabaseFromCsv() throws IOException, URISyntaxException {
    List<Team> teams = teamService.save();
    Assertions.assertEquals(30, teams.size());
  }
}

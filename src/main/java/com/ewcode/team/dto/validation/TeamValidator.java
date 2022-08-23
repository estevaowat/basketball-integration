package com.ewcode.team.dto.validation;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class TeamValidator {
  private final Logger logger = Logger.getLogger(TeamValidator.class.getName());

  public List<String> validate(TeamDto team) {
    logger.info("Validating team");

    List<String> errors = new ArrayList<>();

    if (team.getNickname().isBlank()) {
      errors.add("team has no nickname");
    }

    return new ArrayList<>();
  }
}
